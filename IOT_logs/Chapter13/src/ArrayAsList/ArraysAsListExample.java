package ArrayAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Andrew", "Scott", "Angela");
		for(String name: list1) {
			System.out.println(name);
		}
		
		//���������� ����Ʈ�� ������� �� �� �̷��� ���� �� �ִ�. ���⼭��  add, remove�� �����ϴ�.
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value: list2) {
			System.out.println(value);
		}
		
		List<String> list3 = new ArrayList<>(list1); //�������� 
		list3.add("Test");
		for(String name: list3) {
			System.out.println(name);
		}
	}
}
