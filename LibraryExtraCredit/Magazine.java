
public class Magazine extends Media {

	private String mediaType;
	private String publisher;
	
	public Magazine(String mediaId, String title, String publisher) {
		super(mediaId, title);
		super.setMediaType("Magazine");
		this.publisher = publisher;
	
		
	}
	
	public String toString() {
		return super.toString() + "\nPublisher: " + publisher;
	}

}
