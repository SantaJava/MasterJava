package generic;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		
		//Box<Integer> box1 = new Box<Integer>();
		
		
		Box<Integer>box2 = new Box<Integer>();
		box2.set(3);
		int value = box2.get();
		
		//System.out.println(str + value);
		
		Box<Apple> box3 = new Box<Apple>();
		box3.set(new Apple());
		Apple a = box3.get();
		
		//String aple = box3.get(); //타입 미스매치 컴파일 에러가 난다.

		System.out.println(a);
	}
}
