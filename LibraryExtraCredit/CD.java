
public class CD extends Media {

	private String mediaType;
	private String artist;
	
	public CD(String mediaId, String title, String artist) {
		super(mediaId, title);
		super.setMediaType("CD");
		this.artist = artist;
	
		
	}

	public String toString() {
		return super.toString() + "\nArtist: " + artist;
	}
}

