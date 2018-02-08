
public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		String name = (String)box.get();//Object - String(강제타입변환)
		
		box.set(new Apple()); //Apple - Object(자동타입변환)
		Apple apple = (Apple) box.get();		
	}
}
