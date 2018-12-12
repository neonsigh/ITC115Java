
public abstract class Media {

	
	private String mediaId;
	private String title;
	private String mediaType;
	private boolean reserve;
	private boolean borrowStatus = false;
	
	
	
	public Media(String mediaId, String title) {
		this.mediaId = mediaId;
		this.title = title;
	}
	
	// return a String representation of the object
	public String toString() {
		return ("Media ID: " + mediaId + "\nReserved: " + this.isReserve() + "\nChecked out: " + 
					this.isBorrowStatus() + "\nMedia type: " + mediaType + "\nTitle: " + title);
	}

	public boolean isReserve() {
		return reserve;
	}

	public void setReserve(boolean reserve) {
		this.reserve = reserve;
	}

	public boolean isBorrowStatus() {
		return borrowStatus;
	}

	public void setBorrowStatus(boolean borrowStatus) {
		this.borrowStatus = borrowStatus;
	}
	
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	
	
	
	
	
}
