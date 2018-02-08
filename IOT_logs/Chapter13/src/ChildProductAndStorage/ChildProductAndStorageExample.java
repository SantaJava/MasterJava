package ChildProductAndStorage;
import moreThanTwoGeneric.TV;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		ChildProduct<TV, String, String>product = new ChildProduct<>();
		product.setKind(new TV());
		product.setModel("Smart TV");
		product.setCompany("Samsung");
		
		Storage<TV> storage = new StorageImpl<TV>(100);
		storage.add(new TV(), 0);
		TV tv = storage.get(0);
		//System.out.println(tv);
	}
}
