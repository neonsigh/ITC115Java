import java.text.NumberFormat;

public class Product {

	
	// fields
	private String productCode;
	private String productDesc;
	private double productPrice;
	private int productCount;
	
	// constructor
	public Product (String code) {
		if (code == null) {
			throw new IllegalArgumentException();
		} 
		productCode = code;
		productDesc = "";
		productPrice = 0.0;
		productCount = 0;	
	}

	// getter and setters
	
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	 public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.productPrice);
		return formattedPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	
	// return a String representation of the object
	public String toString() {
		return ("Product: \nID: " + productCode + "\nDescription: " + productDesc + "\nPrice: " + this.getPriceFormatted() + "\nQty: " + productCount);
	}
	
}
