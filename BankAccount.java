import java.text.NumberFormat;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {

	String name;
	double balance;
	double transactionFee;
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		if (balance - (amount + transactionFee) >= 0) {
		balance = balance - (amount + transactionFee);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getTransactionFee() {
		return transactionFee;
	}

	public void setTransactionFee(double transactionFee) {
		this.transactionFee = transactionFee;
	}
	 public String getAmountFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.balance);
		return formattedPrice;
	}
	// return a String representation of the BankAccount details
	public String toString() {
		return (name + ", " + this.getAmountFormatted());
	}
	
	
	
	
}
