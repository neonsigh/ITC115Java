
public class DVD extends Media {

	private String mediaType;
	private String director;
	
	public DVD(String mediaId, String title, String director) {
		super(mediaId, title);
		super.setMediaType("DVD");
		this.director = director;
	
		
	}
	
	public String toString() {
		return super.toString() + "\nDirector: " + director;
	}

}
