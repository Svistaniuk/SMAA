import java.sql.Timestamp;

public class Watchlist {
	private Integer _id;
	private Integer _userId;
	private Integer _playerId;
	private String _notes;
	private Boolean _notifyOnTransfer;
	private Timestamp _addedAt;

	public Watchlist() {
	}

	public void setId(Integer aId) {
		this._id = aId;
	}
	public Integer getId() {
		return this._id;
	}

	public void setUserId(Integer aUserId) {
		this._userId = aUserId;
	}
	public Integer getUserId() {
		return this._userId;
	}

	public void setPlayerId(Integer aPlayerId) {
		this._playerId = aPlayerId;
	}
	public Integer getPlayerId() {
		return this._playerId;
	}

	public void setNotes(String aNotes) {
		this._notes = aNotes;
	}
	public String getNotes() {
		return this._notes;
	}

	public void setNotifyOnTransfer(Boolean aNotifyOnTransfer) {
		this._notifyOnTransfer = aNotifyOnTransfer;
	}
	public Boolean getNotifyOnTransfer() {
		return this._notifyOnTransfer;
	}

	public void setAddedAt(Timestamp aAddedAt) {
		this._addedAt = aAddedAt;
	}
	public Timestamp getAddedAt() {
		return this._addedAt;
	}
}