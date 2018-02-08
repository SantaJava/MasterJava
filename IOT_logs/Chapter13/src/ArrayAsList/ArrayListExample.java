package ArrayAsList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("JAVA");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		// 사용자가 입력한 키워드가 리스트에 있는지 검사.
		// 인덱스와 내용을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 단어: ");
		String keyword = sc.nextLine();

		int ix = list.indexOf(keyword); // keyword가 있는 곳을 찾는다. 인덱스의 내용을 출력.
		if (ix != -1) {
			System.out.println(ix + ":" + list.get(ix));
		} else {
			System.out.println(keyword + "는 리스트에 없습니다.");
		}

		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();

		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();

		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}
