DROP DATABASE IF EXISTS TransferAnalyticsDB;
CREATE DATABASE TransferAnalyticsDB;
USE TransferAnalyticsDB;

-- 1. Таблиця Ліг (Серія А, АПЛ тощо)
CREATE TABLE leagues (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    country VARCHAR(100) NOT NULL,
    tier INT DEFAULT 1, -- Рівень дивізіону (1, 2, 3)
    reputation_score DECIMAL(5, 2)
);

-- 2. Таблиця Клубів
CREATE TABLE clubs (
    id INT AUTO_INCREMENT PRIMARY KEY,
    league_id INT,
    name VARCHAR(255) NOT NULL,
    stadium_name VARCHAR(255),
    founded_year INT,
    budget DECIMAL(18, 2), -- Бюджет клубу
    website_url VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (league_id) REFERENCES leagues(id) ON DELETE SET NULL
);

-- 3. Таблиця Агентів (представники гравців)
CREATE TABLE agents (
    id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    agency_name VARCHAR(255),
    license_number VARCHAR(100) UNIQUE,
    commission_rate DECIMAL(5, 2) DEFAULT 10.00 -- Процент комісії
);

-- 4. Таблиця Гравців
CREATE TABLE players (
    id INT AUTO_INCREMENT PRIMARY KEY,
    club_id INT,
    agent_id INT,
    name VARCHAR(255) NOT NULL,
    nationality VARCHAR(100),
    position ENUM('GK', 'DEF', 'MID', 'FWD'),
    birth_date DATE,
    height_cm INT,
    weight_kg INT,
    preferred_foot ENUM('left', 'right', 'both'),
    market_value DECIMAL(18, 2),
    FOREIGN KEY (club_id) REFERENCES clubs(id),
    FOREIGN KEY (agent_id) REFERENCES agents(id)
);

-- 5. Таблиця Контрактів (Деталі зарплат)
CREATE TABLE contracts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    player_id INT NOT NULL,
    club_id INT NOT NULL,
    start_date DATE,
    end_date DATE,
    weekly_wage DECIMAL(15, 2),
    release_clause DECIMAL(18, 2), -- Сума відступних
    bonuses_details TEXT,
    FOREIGN KEY (player_id) REFERENCES players(id) ON DELETE CASCADE,
    FOREIGN KEY (club_id) REFERENCES clubs(id)
);

-- 6. Таблиця Статистики (для аналітики)
CREATE TABLE player_stats (
    id INT AUTO_INCREMENT PRIMARY KEY,
    player_id INT NOT NULL,
    season VARCHAR(20) NOT NULL, -- наприклад '2024/2025'
    matches_played INT DEFAULT 0,
    goals INT DEFAULT 0,
    assists INT DEFAULT 0,
    yellow_cards INT DEFAULT 0,
    red_cards INT DEFAULT 0,
    minutes_played INT DEFAULT 0,
    rating_avg DECIMAL(4, 2),
    FOREIGN KEY (player_id) REFERENCES players(id) ON DELETE CASCADE
);

-- 7. Таблиця Трансферів (Історія)
CREATE TABLE transfers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    player_id INT NOT NULL,
    from_club_id INT,
    to_club_id INT,
    fee DECIMAL(18, 2),
    transfer_type ENUM('permanent', 'loan', 'free_agent'),
    status ENUM('rumor', 'negotiation', 'official', 'failed') DEFAULT 'rumor',
    transfer_date DATE,
    contract_signed_id INT, -- Посилання на новий контракт
    FOREIGN KEY (player_id) REFERENCES players(id),
    FOREIGN KEY (from_club_id) REFERENCES clubs(id),
    FOREIGN KEY (to_club_id) REFERENCES clubs(id),
    FOREIGN KEY (contract_signed_id) REFERENCES contracts(id)
);

-- 8. Таблиця Користувачів
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    role ENUM('fan', 'scout', 'admin') DEFAULT 'fan',
    subscription_plan ENUM('free', 'premium', 'pro') DEFAULT 'free',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 9. Таблиця Списку обраного (Watchlist)
CREATE TABLE watchlists (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    player_id INT NOT NULL,
    notes TEXT,
    notify_on_transfer BOOLEAN DEFAULT TRUE,
    added_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    FOREIGN KEY (player_id) REFERENCES players(id) ON DELETE CASCADE
);

-- 10. Таблиця Скаутських звітів
CREATE TABLE scout_reports (
    id INT AUTO_INCREMENT PRIMARY KEY,
    scout_user_id INT NOT NULL,
    player_id INT NOT NULL,
    match_date DATE,
    report_text TEXT,
    potential_score INT CHECK (potential_score BETWEEN 1 AND 100),
    current_ability_score INT CHECK (current_ability_score BETWEEN 1 AND 100),
    is_published BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (scout_user_id) REFERENCES users(id),
    FOREIGN KEY (player_id) REFERENCES players(id)
);