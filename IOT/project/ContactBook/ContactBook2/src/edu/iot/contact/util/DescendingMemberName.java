package edu.iot.contact.util;
import java.util.Comparator;
import edu.iot.contact.model.Member;


public class DescendingMemberName implements Comparator<Member> {

	@Override
	public int compare(Member o1, Member o2) {
		// TODO Auto-generated method stub
		String name1 = o1.getName();
		String name2 = o2.getName();
		//return name2.compareTo(name1);
		return -name1.compareTo(name2); //마이너스를 붙여서 반대값 리턴
	}
}
