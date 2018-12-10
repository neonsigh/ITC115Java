
public class TicketMain {

	public static void main(String[] args) {

		Ticket[] alltickets = new Ticket[6];
		alltickets[0] = new AdvTicket("000001", 18);
		alltickets[1] = new AdvTicket("000002", 16);
		alltickets[2] = new StudentAdvTicket("000003", 14);
		alltickets[3] = new AdvTicket("000004", 6);
		alltickets[4] = new StudentAdvTicket("000005", 4);
		alltickets[5] = new WalkupTicket("000006");
		
	for(int i = 0; i < alltickets.length; i++) {
		if (alltickets[i].getPrice() == 20.00 || alltickets[i].getPrice() == 15.00) {
			System.out.println(alltickets[i] + " (ID required)");
			System.out.println();
		} else {
		System.out.println(alltickets[i]);
		System.out.println();
	}

	
	}
	}
}
