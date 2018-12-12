
public class Book extends Media {

	private String mediaType;
	private String author;
	private String publisher;
	
	public Book(String mediaId, String title, String author, String publisher) {
		super(mediaId, title);
		super.setMediaType("Book");
		this.author = author;
		this.publisher = publisher;
	
		
	}


	public String toString() {
		return super.toString() + "\nAuthor: " + author + "\nPublisher: " + publisher;
	}
	
}
