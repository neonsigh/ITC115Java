import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println(season(console));
		
		
	}
	
	
	public static String season(Scanner console) {
		System.out.println("Enter number of month, followed by number of day: ");
		int month = console.nextInt();
		int day = console.nextInt();
		console.close();
		if ( (month == 12 && day >= 16) || (month == 1) || (month == 2) 
				|| (month == 3 && day <= 15) ) {
			return "winter";
		} else if ( (month == 3 && day >= 16) || (month == 4) || (month == 5) 
				|| (month == 6 && day <= 15) ) {
			return "spring";
		} else if ( (month == 6 && day >= 16) || (month == 7) || (month == 8) 
				|| (month == 9 && day <= 15) ) {
			return "summer";
		} else {
			return "fall";
		}
	}
}
