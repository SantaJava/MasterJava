package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30)); //hashcode�� equals�� �ϳ��� ������ ���ϸ� �� ��ü �ΰ��� �� ���� �ȴ�. 
		
		Member m1 = new Member("���ο�", 27);
		Member m2 = new Member("���ο�", 27);
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
		System.out.println("�� ��ü��: " + set.size());
	}
}
