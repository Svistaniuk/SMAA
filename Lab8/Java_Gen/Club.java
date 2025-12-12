import java.sql.Timestamp;
import java.math.BigDecimal;

public class Club {
	private Integer _id;
	private Integer _leagueId;
	private String _name;
	private String _stadiumName;
	private Integer _foundedYear;
	private BigDecimal _budget;
	private String _websiteUrl;
	private Timestamp _createdAt;

	public Club() {
	}

	public void setId(Integer aId) {
		this._id = aId;
	}
	public Integer getId() {
		return this._id;
	}

	public void setLeagueId(Integer aLeagueId) {
		this._leagueId = aLeagueId;
	}
	public Integer getLeagueId() {
		return this._leagueId;
	}

	public void setName(String aName) {
		this._name = aName;
	}
	public String getName() {
		return this._name;
	}

	public void setStadiumName(String aStadiumName) {
		this._stadiumName = aStadiumName;
	}
	public String getStadiumName() {
		return this._stadiumName;
	}

	public void setFoundedYear(Integer aFoundedYear) {
		this._foundedYear = aFoundedYear;
	}
	public Integer getFoundedYear() {
		return this._foundedYear;
	}

	public void setBudget(BigDecimal aBudget) {
		this._budget = aBudget;
	}
	public BigDecimal getBudget() {
		return this._budget;
	}

	public void setWebsiteUrl(String aWebsiteUrl) {
		this._websiteUrl = aWebsiteUrl;
	}
	public String getWebsiteUrl() {
		return this._websiteUrl;
	}

	public void setCreatedAt(Timestamp aCreatedAt) {
		this._createdAt = aCreatedAt;
	}
	public Timestamp getCreatedAt() {
		return this._createdAt;
	}
}