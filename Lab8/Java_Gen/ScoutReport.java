import java.sql.Date;

public class ScoutReport {
	private Integer _id;
	private Integer _scoutUserId;
	private Integer _playerId;
	private Date _matchDate;
	private String _reportText;
	private Integer _potentialScore;
	private Integer _currentAbilityScore;
	private Boolean _isPublished;

	public ScoutReport() {
	}

	public void setId(Integer aId) {
		this._id = aId;
	}
	public Integer getId() {
		return this._id;
	}

	public void setScoutUserId(Integer aScoutUserId) {
		this._scoutUserId = aScoutUserId;
	}
	public Integer getScoutUserId() {
		return this._scoutUserId;
	}

	public void setPlayerId(Integer aPlayerId) {
		this._playerId = aPlayerId;
	}
	public Integer getPlayerId() {
		return this._playerId;
	}

	public void setMatchDate(Date aMatchDate) {
		this._matchDate = aMatchDate;
	}
	public Date getMatchDate() {
		return this._matchDate;
	}

	public void setReportText(String aReportText) {
		this._reportText = aReportText;
	}
	public String getReportText() {
		return this._reportText;
	}

	public void setPotentialScore(Integer aPotentialScore) {
		this._potentialScore = aPotentialScore;
	}
	public Integer getPotentialScore() {
		return this._potentialScore;
	}

	public void setCurrentAbilityScore(Integer aCurrentAbilityScore) {
		this._currentAbilityScore = aCurrentAbilityScore;
	}
	public Integer getCurrentAbilityScore() {
		return this._currentAbilityScore;
	}

	public void setIsPublished(Boolean aIsPublished) {
		this._isPublished = aIsPublished;
	}
	public Boolean getIsPublished() {
		return this._isPublished;
	}
}