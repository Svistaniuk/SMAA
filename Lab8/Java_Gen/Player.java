import java.sql.Date;
import java.math.BigDecimal;

public class Player {
	private Integer _id;
	private Integer _clubId;
	private Integer _agentId;
	private String _name;
	private String _nationality;
	private String _position;
	private Date _birthDate;
	private Integer _heightCm;
	private Integer _weightKg;
	private String _preferredFoot;
	private BigDecimal _marketValue;

	public Player() {
	}

	public void setId(Integer aId) {
		this._id = aId;
	}
	public Integer getId() {
		return this._id;
	}

	public void setClubId(Integer aClubId) {
		this._clubId = aClubId;
	}
	public Integer getClubId() {
		return this._clubId;
	}

	public void setAgentId(Integer aAgentId) {
		this._agentId = aAgentId;
	}
	public Integer getAgentId() {
		return this._agentId;
	}

	public void setName(String aName) {
		this._name = aName;
	}
	public String getName() {
		return this._name;
	}

	public void setNationality(String aNationality) {
		this._nationality = aNationality;
	}
	public String getNationality() {
		return this._nationality;
	}

	public void setPosition(String aPosition) {
		this._position = aPosition;
	}
	public String getPosition() {
		return this._position;
	}

	public void setBirthDate(Date aBirthDate) {
		this._birthDate = aBirthDate;
	}
	public Date getBirthDate() {
		return this._birthDate;
	}

	public void setHeightCm(Integer aHeightCm) {
		this._heightCm = aHeightCm;
	}
	public Integer getHeightCm() {
		return this._heightCm;
	}

	public void setWeightKg(Integer aWeightKg) {
		this._weightKg = aWeightKg;
	}
	public Integer getWeightKg() {
		return this._weightKg;
	}

	public void setPreferredFoot(String aPreferredFoot) {
		this._preferredFoot = aPreferredFoot;
	}
	public String getPreferredFoot() {
		return this._preferredFoot;
	}

	public void setMarketValue(BigDecimal aMarketValue) {
		this._marketValue = aMarketValue;
	}
	public BigDecimal getMarketValue() {
		return this._marketValue;
	}
}