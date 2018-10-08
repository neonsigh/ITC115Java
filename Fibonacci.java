
public class Fibonacci {

	public static void main(String[] args) {
		// First two values of the Fibonacci sequence initialized and printed
		int firstNum = 1;
		int secondNum = 1;
		System.out.print(firstNum + " " + secondNum + " "); 
		// Following characters of the Fibonacci sequence computed and printed
		for (int i = 1; i < 11; i++) {
			int sum = firstNum + secondNum;
			System.out.print(sum + " ");
			firstNum = secondNum;
			secondNum = sum;
		}
		
	}

}
