

public class Seasons {

	public static void main(String[] args) {
		System.out.println("March 17: " + season(3, 17));
		System.out.println("December 11: " + season(12, 11));
	}
	
	
	public static String season(int month, int day) {

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
