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
		
		//수정가능한 리스트를 만들고자 할 때 이렇게 만들 수 있다. 여기서는  add, remove가 가능하다.
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value: list2) {
			System.out.println(value);
		}
		
		List<String> list3 = new ArrayList<>(list1); //얕은복사 
		list3.add("Test");
		for(String name: list3) {
			System.out.println(name);
		}
	}
}
