import java.math.BigDecimal;

public class League {
	private Integer _id;
	private String _name;
	private String _country;
	private Integer _tier;
	private BigDecimal _reputationScore;

	public League() {
	}

	public void setId(Integer aId) {
		this._id = aId;
	}
	public Integer getId() {
		return this._id;
	}

	public void setName(String aName) {
		this._name = aName;
	}
	public String getName() {
		return this._name;
	}

	public void setCountry(String aCountry) {
		this._country = aCountry;
	}
	public String getCountry() {
		return this._country;
	}

	public void setTier(Integer aTier) {
		this._tier = aTier;
	}
	public Integer getTier() {
		return this._tier;
	}

	public void setReputationScore(BigDecimal aReputationScore) {
		this._reputationScore = aReputationScore;
	}
	public BigDecimal getReputationScore() {
		return this._reputationScore;
	}
}