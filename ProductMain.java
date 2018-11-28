
public class ProductMain {

	public static void main(String[] args) {

		Product p1 = new Product("000001");
		p1.setProductDesc("MacBook Pro (Retina, 13-inch, Early 2015)");
		p1.setProductPrice(1799.00);
		p1.setProductCount(1);
		
		Product p2 = new Product("000002");
		p2.setProductDesc("Koompi KOSMOS (KramaOS, IPS, 13-inch, Late 2018)");
		p2.setProductPrice(369.00);
		p2.setProductCount(1);
		

		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
	}

}
