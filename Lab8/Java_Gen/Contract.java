import java.sql.Date;
import java.math.BigDecimal;

public class Contract {
	private Integer _id;
	private Integer _playerId;
	private Integer _clubId;
	private Date _startDate;
	private Date _endDate;
	private BigDecimal _weeklyWage;
	private BigDecimal _releaseClause;
	private String _bonusesDetails;

	public Contract() {
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

	public void setClubId(Integer aClubId) {
		this._clubId = aClubId;
	}
	public Integer getClubId() {
		return this._clubId;
	}

	public void setStartDate(Date aStartDate) {
		this._startDate = aStartDate;
	}
	public Date getStartDate() {
		return this._startDate;
	}

	public void setEndDate(Date aEndDate) {
		this._endDate = aEndDate;
	}
	public Date getEndDate() {
		return this._endDate;
	}

	public void setWeeklyWage(BigDecimal aWeeklyWage) {
		this._weeklyWage = aWeeklyWage;
	}
	public BigDecimal getWeeklyWage() {
		return this._weeklyWage;
	}

	public void setReleaseClause(BigDecimal aReleaseClause) {
		this._releaseClause = aReleaseClause;
	}
	public BigDecimal getReleaseClause() {
		return this._releaseClause;
	}

	public void setBonusesDetails(String aBonusesDetails) {
		this._bonusesDetails = aBonusesDetails;
	}
	public String getBonusesDetails() {
		return this._bonusesDetails;
	}
}