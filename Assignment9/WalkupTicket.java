
public class WalkupTicket extends Ticket {

	private double walkupPrice;
	
	public WalkupTicket(String number) {
		super(number);
		walkupPrice = 50.00;
	}

	@Override
	public double getPrice() {
		
	return walkupPrice;
	}
}
