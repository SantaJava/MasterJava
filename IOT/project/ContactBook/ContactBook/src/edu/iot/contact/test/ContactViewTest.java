package edu.iot.contact.test;

import edu.iot.contact.model.Contact;
import edu.iot.contact.view.ContactView;
//���� �׽�Ʈ : �޼��� �׽�Ʈ... 

public class ContactViewTest {
	public static void main(String[] args) {
		testCreateContactView();
		testSelectMenu();
	}
	
	public static void testCreateContactView(){		
		ContactView view = ContactView.getInstance();
		Contact contact = view.getNewContact(); //�̷��� �ص� ȣ���� ��.
		System.out.println(contact);
	}
	
	public static void testSelectMenu(){
		ContactView view = ContactView.getInstance();
		int index = view.SelectMenu();
		//System.out.println(index);		
	}
}
