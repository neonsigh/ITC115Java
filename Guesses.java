import java.util.Random;

public class Guesses {

	public static void main(String[] args) {
		makeGuesses();
	}
	

	public static void makeGuesses() { 
		Random guess = new Random();
		int currentGuess = 0;
		int totalGuesses = 0;
		while (currentGuess < 48) {
			currentGuess = guess.nextInt(50) + 1;
			totalGuesses = totalGuesses + 1;
			System.out.println("guess = " + currentGuess);
		}
		if (currentGuess >= 48) {
			System.out.println("total guesses = " + totalGuesses);
		}
		
	}

}
