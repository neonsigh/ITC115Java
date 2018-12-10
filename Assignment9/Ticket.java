import java.text.NumberFormat;

public abstract class Ticket {

	private String number;
	
	public Ticket(String number) {
		this.number = number;
	}
	
	public abstract double getPrice();
	
	 public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.getPrice());
		return formattedPrice;
	}
	
	// return a String representation of the object
	public String toString() {
		return ("Number " + number + ", Price: " + this.getPriceFormatted());
	}
	
}
