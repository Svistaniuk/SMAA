import java.math.BigDecimal;

public class Agent {
	private Integer _id;
	private String _fullName;
	private String _agencyName;
	private String _licenseNumber;
	private BigDecimal _commissionRate;

	public Agent() {
	}

	public void setId(Integer aId) {
		this._id = aId;
	}
	public Integer getId() {
		return this._id;
	}

	public void setFullName(String aFullName) {
		this._fullName = aFullName;
	}
	public String getFullName() {
		return this._fullName;
	}

	public void setAgencyName(String aAgencyName) {
		this._agencyName = aAgencyName;
	}
	public String getAgencyName() {
		return this._agencyName;
	}

	public void setLicenseNumber(String aLicenseNumber) {
		this._licenseNumber = aLicenseNumber;
	}
	public String getLicenseNumber() {
		return this._licenseNumber;
	}

	public void setCommissionRate(BigDecimal aCommissionRate) {
		this._commissionRate = aCommissionRate;
	}
	public BigDecimal getCommissionRate() {
		return this._commissionRate;
	}
}