package edu.iot.contact.test;

import edu.iot.contact.model.Contact;

public class ContactTest { //���� ���� Ŭ������ ����� �����ϴ��� �����ϱ� ����.
	public static void main(String[] args) {
		testCreateContact();
	}
	
	public static void testCreateContact() {
		//����Ʈ ������ �׽�Ʈ
		Contact contact1 = new Contact();
		System.out.println("����Ʈ ������ �׽�Ʈ");
		System.out.println(contact1); //toString methodȣ��.
		
		//������ �׽�Ʈ
		Contact contact2 = new Contact(
				"�ο�","��������","010-9999-9999","karidy11@gmail.com");
		System.out.println("������ �׽�Ʈ");
		System.out.println(contact2);
	}
}
