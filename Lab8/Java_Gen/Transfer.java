import java.sql.Date;
import java.math.BigDecimal;

public class Transfer {
	private Integer _id;
	private Integer _playerId;
	private Integer _fromClubId;
	private Integer _toClubId;
	private BigDecimal _fee;
	private String _transferType;
	private String _status;
	private Date _transferDate;
	private Integer _contractSignedId;

	public Transfer() {
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

	public void setFromClubId(Integer aFromClubId) {
		this._fromClubId = aFromClubId;
	}
	public Integer getFromClubId() {
		return this._fromClubId;
	}

	public void setToClubId(Integer aToClubId) {
		this._toClubId = aToClubId;
	}
	public Integer getToClubId() {
		return this._toClubId;
	}

	public void setFee(BigDecimal aFee) {
		this._fee = aFee;
	}
	public BigDecimal getFee() {
		return this._fee;
	}

	public void setTransferType(String aTransferType) {
		this._transferType = aTransferType;
	}
	public String getTransferType() {
		return this._transferType;
	}

	public void setStatus(String aStatus) {
		this._status = aStatus;
	}
	public String getStatus() {
		return this._status;
	}

	public void setTransferDate(Date aTransferDate) {
		this._transferDate = aTransferDate;
	}
	public Date getTransferDate() {
		return this._transferDate;
	}

	public void setContractSignedId(Integer aContractSignedId) {
		this._contractSignedId = aContractSignedId;
	}
	public Integer getContractSignedId() {
		return this._contractSignedId;
	}
}