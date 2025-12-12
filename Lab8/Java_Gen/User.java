import java.sql.Timestamp;

public class User {
	private Integer _id;
	private String _username;
	private String _email;
	private String _passwordHash;
	private String _role;
	private String _subscriptionPlan;
	private Timestamp _createdAt;

	public User() {
	}

	public void setId(Integer aId) {
		this._id = aId;
	}
	public Integer getId() {
		return this._id;
	}

	public void setUsername(String aUsername) {
		this._username = aUsername;
	}
	public String getUsername() {
		return this._username;
	}

	public void setEmail(String aEmail) {
		this._email = aEmail;
	}
	public String getEmail() {
		return this._email;
	}

	public void setPasswordHash(String aPasswordHash) {
		this._passwordHash = aPasswordHash;
	}
	public String getPasswordHash() {
		return this._passwordHash;
	}

	public void setRole(String aRole) {
		this._role = aRole;
	}
	public String getRole() {
		return this._role;
	}

	public void setSubscriptionPlan(String aSubscriptionPlan) {
		this._subscriptionPlan = aSubscriptionPlan;
	}
	public String getSubscriptionPlan() {
		return this._subscriptionPlan;
	}

	public void setCreatedAt(Timestamp aCreatedAt) {
		this._createdAt = aCreatedAt;
	}
	public Timestamp getCreatedAt() {
		return this._createdAt;
	}
}