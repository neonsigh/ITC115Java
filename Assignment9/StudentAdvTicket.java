
public class StudentAdvTicket extends AdvTicket {

	private double advStudentPrice;
	private int daysPrior;
	
	public StudentAdvTicket(String number, int daysPrior) {
		super(number, daysPrior);
		this.daysPrior = daysPrior;
		if (daysPrior < 10) {
			advStudentPrice = 20.00; 
		} else {
			advStudentPrice = 15.00;
			}
		}
	
	@Override
	public double getPrice() {
		return advStudentPrice;
	}

}
