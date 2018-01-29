package edu.iot.contact.test;

import edu.iot.contact.model.Contact;

public class ContactTest { //내가 만든 클래스가 제대로 동작하는지 검증하기 위함.
	public static void main(String[] args) {
		testCreateContact();
	}
	
	public static void testCreateContact() {
		//디폴트 생성자 테스트
		Contact contact1 = new Contact();
		System.out.println("디폴트 생성자 테스트");
		System.out.println(contact1); //toString method호출.
		
		//생성자 테스트
		Contact contact2 = new Contact(
				"인우","영등포구","010-9999-9999","karidy11@gmail.com");
		System.out.println("생성자 테스트");
		System.out.println(contact2);
	}
}
