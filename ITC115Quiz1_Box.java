
public class ITC115Quiz1_Box {

	public static void main(String[] args) {
		drawBox();
		simpleLoop();
	}
	public static void drawBox() { // create box design
		System.out.println("+++++");
		System.out.println("|   |");
		System.out.println("+++++");
	}



	public static void simpleLoop() {
		System.out.println("Printing values:");
		for (int i=1; i <= 7; i++) {
			System.out.print(i + " ");
		}
	}

}