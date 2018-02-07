package edu.iot.contact.util;

import java.util.Comparator;

import edu.iot.contact.model.Member;

/**
 * @author MelissaG
 *
 *sort names with Ascending Order
 *first factor: names 
 *
 */
public class AscendingMemberName implements Comparator<Member> {

	/* (non-Javadoc)
	 * 
	 * return o1.getName().compareTo(o2.getName());
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Member o1, Member o2) {
		// TODO Auto-generated method stub
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name1.compareTo(name2);		
	}
}
