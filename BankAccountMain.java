
public class BankAccountMain {

	public static void main(String[] args) {

		BankAccount lee = new BankAccount();
		
		lee.setName("Lee");
		lee.setBalance(500.0);
		lee.setTransactionFee(3.0);
		System.out.println(lee);
		lee.withdraw(300.0);
		System.out.println();
		System.out.println(lee);

		

	}

}
