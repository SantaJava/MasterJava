package test;

import java.util.Comparator;

public class Order {
	
	public static final Comparator<String> ASC_MEMBER_NAME = new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
	};

	public static final Comparator<String> DES_MEMBER_NAME = new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}

	};

	public static final Comparator<String> ASC_MEMBER_LEVEL = new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
	};
	
}
