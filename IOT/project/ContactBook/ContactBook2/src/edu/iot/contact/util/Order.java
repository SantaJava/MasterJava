package edu.iot.contact.util;

import java.util.Comparator;

import edu.iot.contact.model.Member;

public class Order {
	
	public static final Comparator<Member> ASC_MEMBER_NAME = new Comparator<Member>() {
		@Override
		public int compare(Member o1, Member o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};

	public static final Comparator<Member> DES_MEMBER_NAME = new Comparator<Member>() {
		@Override
		public int compare(Member o1, Member o2) {
			return -o1.getName().compareTo(o2.getName());
		}

	};

	public static final Comparator<Member> ASC_MEMBER_LEVEL = new Comparator<Member>() {
		@Override
		public int compare(Member o1, Member o2) {
			return o1.getLevel().compareTo(o2.getLevel());
		}
	};
	
	public static final Comparator<Member> DES_MEMBER_LEVEL = new Comparator<Member>() {
		@Override
		public int compare(Member o1, Member o2) {
			return -o1.getLevel().compareTo(o2.getLevel());
		}
	};

}
