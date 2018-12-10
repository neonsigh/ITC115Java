
public class AdvTicket extends Ticket {

	private double advPrice;
	private int daysPrior;
	
	public AdvTicket(String number, int daysPrior) {
		super(number);
		this.daysPrior = daysPrior;
		if (daysPrior < 10) {
			advPrice = 40.00; 
		} else {
			advPrice = 30.00;
			}
		}


	@Override
	public double getPrice() {
		return advPrice;
	}

}
