import java.lang.Math;

public class Powers {

	public static void main(String[] args) {

		printPowersOfN(2,7);
		System.out.println();
		printPowersOfN(5,3);
	}
	
		
	public static void printPowersOfN(int base, int exponent) {
		for (int i = 0; i <= exponent; i++) {
			System.out.print( (int) Math.pow(base, i) + " ");
		}
		
	}	
	
}
	
	
	/*
	public static void printPowersOfN(int base, int exponent) {
		int basePowOne = base / base;
		int temp = base;
		int result;
		
		System.out.print(basePowOne + " ");
		
		for (int i = 1; i <= exponent; i++) {
			result = (temp * base);
			System.out.print(result + " ");
			temp = result;
		}
		
	}
	*/
	







