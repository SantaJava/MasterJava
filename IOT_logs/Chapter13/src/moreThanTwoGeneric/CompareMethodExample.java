package moreThanTwoGeneric;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		boolean result1 = Util.<Integer, String>compare(p1, p2); // 여기서 메소드 타입 생략 가능. K와 V는 매게변수가 어떤 인스턴스가 왔는지 컴파일러가 파악할
																	// 수 있기 때문에, 컴파일러가 K와 V를 유추해낼 수 있기 때문에 메소드의 제너릭과 같다.																	// String과 String이렇게 유추가 가능하기 떄문에 생략 가능.
		if (result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}

		Pair<String, String> p3 = new Pair<String, String>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<String, String>("user2", "홍길동"); //키와 벨류값이 같아야 같다.
		boolean result2 = Util.compare(p3, p4);
		if (result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
	}
}
