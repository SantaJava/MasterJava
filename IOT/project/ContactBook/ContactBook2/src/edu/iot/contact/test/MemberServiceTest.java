package edu.iot.contact.test;

import java.util.List;

import edu.iot.contact.model.Member;
import edu.iot.contact.service.MemberService;

public class MemberServiceTest {
	public static void main(String[] args) {
		testCreateMemberService();
		testLogin();
	}

	public static void testCreateMemberService() {
		MemberService service = new MemberService();
		List<Member> list = service.getMemberList();
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
			service.login("ÀÎ¿ì22", "1234");
			System.out.println("Login Successful");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
