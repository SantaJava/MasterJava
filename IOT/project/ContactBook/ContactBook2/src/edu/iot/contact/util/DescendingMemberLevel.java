package edu.iot.contact.util;

import java.util.Comparator;

import edu.iot.contact.model.Member;
import edu.iot.contact.model.MemberLevel;

public class DescendingMemberLevel implements Comparator<Member> {

	@Override
	public int compare(Member o1, Member o2) {
		// TODO Auto-generated method stub
		MemberLevel level1 = o1.getLevel();
		MemberLevel level2 = o1.getLevel();
		int result = level1.compareTo(level2);
		if(result == 0) {
			String name1 = o1.getName();
			String name2 = o2.getName();
			return name1.compareTo(name2);
		}
		return level1.compareTo(level2);
	}

}
