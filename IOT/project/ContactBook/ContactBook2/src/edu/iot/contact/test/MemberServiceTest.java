package edu.iot.contact.test;

import java.util.Comparator;
import java.util.List;

import edu.iot.contact.model.Member;
import edu.iot.contact.model.MemberLevel;
import edu.iot.contact.service.MemberService;
import edu.iot.contact.util.AscendingMemberLevel;
import edu.iot.contact.util.DescendingMemberLevel;
import edu.iot.contact.util.Order;

public class MemberServiceTest {
	public static void main(String[] args) {
		testCreateMemberService();
		testLogin();
		testGetMemberLevel();
	}

	public static void testCreateMemberService() {
		MemberService service = new MemberService();
		List<Member> list = service.getMemberList();
		
		list.sort(new AscendingMemberLevel());
		for (Member member : list) {
			System.out.println(member);
		}
	}

	public static void testLogin() {
		MemberService service = new MemberService();

		try {
			service.login("admin1", "1234");
			System.out.println("Login Successful");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			service.login("인우22", "1234");
			System.out.println("Login Successful");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void testGetMemberLevel() {
		MemberService service = new MemberService();
		List<Member> list = service.getMemberLevel(MemberLevel.GOLD, Order.DES_MEMBER_NAME);
		// getMembers의 참조값을 받고, getMembers의 list 지역변수는
																		// 사라진다.
		// list가 새롭게 getMembers의 참조를 이어받음.
		// AscendingMemberName
		for (Member m : list) {
			System.out.println(m);
		}
		
		System.out.println("======================");
		// 새로운 리스트 참조. 기존list는 garbage가 되고, 이 리스트는 이 method가 끝날때 사라진다.
		list = service.getMemberLevel(MemberLevel.NORMAL, new AscendingMemberLevel());
		for (Member m : list) {
			System.out.println(m);
		}
		System.out.println("======================");
		//정렬이 완료된 새로운 리스트를 받는다. 
		list = service.getMemberLevel(null, new Comparator<Member>() {
			
			@Override
			public int compare(Member o1, Member o2) {
				// TODO Auto-generated method stub
				String id1 = o1.getUserId();
				String id2 = o1.getAddress();
				return id1.compareTo(id2);
			}
		});
		for(Member m: list) {
			System.out.println(m);
		}
	}
}
