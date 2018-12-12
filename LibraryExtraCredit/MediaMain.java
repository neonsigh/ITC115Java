
public class MediaMain {

	public static void main(String[] args) {

		Media[] libmedia = new Media[6];
		libmedia[0] = new Book("001", "Coraline", "Neil Gaiman", "Bloomsbury");
		libmedia[1] = new CD("002", "Amnesiac", "Radiohead");
		libmedia[2] = new DVD("003", "The Lives Of Others", "von Donnersmarck, Florian Henckel & Mark Schlichter");
		libmedia[3] = new Magazine("004", "Fortean Times", "Dennis Publishing Ltd");
		libmedia[4] = new Book("005", "Building Java Programs", "Reges, Stuart & Marty Stepp", "Pearson");
		libmedia[5] = new CD("006", "Revolver", "The Beatles");

		for(int i = 0; i < libmedia.length; i++) {
			System.out.println(libmedia[i].toString());
			System.out.println();
	}
		
	libmedia[2].setReserve(true);
	System.out.println(libmedia[2].toString());
	
	System.out.println();
	libmedia[4].setBorrowStatus(true);
	System.out.println(libmedia[4].toString());

}
	
}
