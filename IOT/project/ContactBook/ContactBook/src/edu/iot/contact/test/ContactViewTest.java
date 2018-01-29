package edu.iot.contact.test;

import edu.iot.contact.model.Contact;
import edu.iot.contact.view.ContactView;
//단위 테스트 : 메서드 테스트... 

public class ContactViewTest {
	public static void main(String[] args) {
		testCreateContactView();
	}
	
	public static void testCreateContactView(){		
		ContactView view = ContactView.getInstance();
		Contact contact = view.getNewContact(); //이렇게 해도 호출이 됨. 
		System.out.println(contact);
	}
}
