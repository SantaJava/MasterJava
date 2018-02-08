package moreThanTwoGeneric;

public class ProductExample {
	public static void main(String[] args) {
		
		Product <TV,String> product1 = new Product<TV,String>();
		product1.setKind(new TV());
		product1.setModel("스마트Tv");
		TV tv = new TV();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<Car, String>();
		//Product<TV,String> product2 = new Product<TV,String>();
		
		product2.setKind(new Car());
		product2.setModel("전기 자동차");
		Car car = new Car();
		String carModel = product2.getModel();
		
	}
}
