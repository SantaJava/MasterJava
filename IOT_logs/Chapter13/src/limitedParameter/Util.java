package limitedParameter;

import moreThanTwoGeneric.Pair;

public class Util {
	//compare 추가
	public static <T extends Number> int compare(T t1, T t2) { //상속 받음. 
		double v1 = t1.doubleValue();
		System.out.println(t1.getClass().getName());
		double v2 = t2.doubleValue();
		System.out.println(t2.getClass().getName()); //클래스 명만 필요하다. 할 때는 getSimple Name.
		return Double.compare(v1, v2);
	}
	
	public static<K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare; //둘다 true여야 논리적으로 동등하다고 할 수 있다. 
		
	}
}
