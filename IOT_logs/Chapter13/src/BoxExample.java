
public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		String name = (String)box.get();//Object - String(����Ÿ�Ժ�ȯ)
		
		box.set(new Apple()); //Apple - Object(�ڵ�Ÿ�Ժ�ȯ)
		Apple apple = (Apple) box.get();		
	}
}
