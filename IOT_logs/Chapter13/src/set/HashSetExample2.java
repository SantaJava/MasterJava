package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30)); //hashcode와 equals중 하나라도 구현을 안하면 이 객체 두개가 다 들어가게 된다. 
		
		Member m1 = new Member("구인우", 27);
		Member m2 = new Member("구인우", 27);
		System.out.println("======");
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println("======");
		System.out.println(m1.equals(m2)); //true. 
		System.out.println("======");
		
		set.add(m1);
		set.add(m2);
		
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()==true) {
			System.out.println(iterator.next());
		}	
		System.out.println("총 개체수: " + set.size());
	}
}
