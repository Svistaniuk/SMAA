import java.math.BigDecimal;

public class PlayerStats {
	private Integer _id;
	private Integer _playerId;
	private String _season;
	private Integer _matchesPlayed;
	private Integer _goals;
	private Integer _assists;
	private Integer _yellowCards;
	private Integer _redCards;
	private Integer _minutesPlayed;
	private BigDecimal _ratingAvg;

	public PlayerStats() {
	}

	public void setId(Integer aId) {
		this._id = aId;
	}
	public Integer getId() {
		return this._id;
	}

	public void setPlayerId(Integer aPlayerId) {
		this._playerId = aPlayerId;
	}
	public Integer getPlayerId() {
		return this._playerId;
	}

	public void setSeason(String aSeason) {
		this._season = aSeason;
	}
	public String getSeason() {
		return this._season;
	}

	public void setMatchesPlayed(Integer aMatchesPlayed) {
		this._matchesPlayed = aMatchesPlayed;
	}
	public Integer getMatchesPlayed() {
		return this._matchesPlayed;
	}

	public void setGoals(Integer aGoals) {
		this._goals = aGoals;
	}
	public Integer getGoals() {
		return this._goals;
	}

	public void setAssists(Integer aAssists) {
		this._assists = aAssists;
	}
	public Integer getAssists() {
		return this._assists;
	}

	public void setYellowCards(Integer aYellowCards) {
		this._yellowCards = aYellowCards;
	}
	public Integer getYellowCards() {
		return this._yellowCards;
	}

	public void setRedCards(Integer aRedCards) {
		this._redCards = aRedCards;
	}
	public Integer getRedCards() {
		return this._redCards;
	}

	public void setMinutesPlayed(Integer aMinutesPlayed) {
		this._minutesPlayed = aMinutesPlayed;
	}
	public Integer getMinutesPlayed() {
		return this._minutesPlayed;
	}

	public void setRatingAvg(BigDecimal aRatingAvg) {
		this._ratingAvg = aRatingAvg;
	}
	public BigDecimal getRatingAvg() {
		return this._ratingAvg;
	}
}