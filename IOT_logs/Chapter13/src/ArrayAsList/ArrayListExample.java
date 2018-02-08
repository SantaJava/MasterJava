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

		// ����ڰ� �Է��� Ű���尡 ����Ʈ�� �ִ��� �˻�.
		// �ε����� ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.println("ã�� �ܾ�: ");
		String keyword = sc.nextLine();

		int ix = list.indexOf(keyword); // keyword�� �ִ� ���� ã�´�. �ε����� ������ ���.
		if (ix != -1) {
			System.out.println(ix + ":" + list.get(ix));
		} else {
			System.out.println(keyword + "�� ����Ʈ�� �����ϴ�.");
		}

		int size = list.size();
		System.out.println("�� ��ü ��: " + size);
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
