package edu.iot.contact.test;

import edu.iot.contact.model.Contact;
import edu.iot.contact.service.ContactBook;

public class ContactBookTest {
	public static void main(String[] args) {
		testCreateContactBook();
		testFindEmptyIndex();
		testAddContact();
		testPrintList();
		testUpdateContact();
	}

	public static void testCreateContactBook() {
		ContactBook contactBook = new ContactBook();
		// �������� �� ���и� �˷��ִ� �ڵ�
		Contact[] contacts = contactBook.getContactBook(); // �ٸ� ������ ����.

		if (contacts.length != ContactBook.BOOK_SIZE) {
			System.out.println("�迭�� �ʱ� ũ�Ⱑ �߸��ƽ��ϴ�.");
		}

		int count = 0;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i] != null) {
				count++;
			}
		}

		if (count != 30) {
			System.out.println("�ʱ� ���� ������ ������ �߸� ����ϴ�.");
		}
		System.out.println("ContactBook ���� �׽�Ʈ �Ϸ�.");
	}
	
	public static void testFindEmptyIndex() {
		ContactBook contactBook = new ContactBook();
		int index = contactBook.findEmptyIndex();
		//System.out.println(index); //30���� �� �ְ� 30�� ���ϵ�. 
		if(index == -1) {
			System.out.println("�ε��� ã�� ����");
		}
		System.out.println("findEmptyIndex �׽�Ʈ �Ϸ�");
	}
	
	public static void testUpdateContact() {
		ContactBook contactBook = new ContactBook();
		contactBook.printList();
		contactBook.updateContact();
		contactBook.printList();
		contactBook.printContact();
	}
	
	public static void testAddContact() {
		ContactBook contactBook = new ContactBook();
		contactBook.addContact();
		
		Contact[] contacts = contactBook.getContactBook();
		if(contacts[30] == null) {
			System.out.println("�߰� ����");
			return;
		}
		System.out.println(contacts[30]);
	}


	public static void testPrintList() {
		ContactBook contactBook = new ContactBook();	
		Contact[] contacts = contactBook.getContactBook();
			contactBook.printList();
	}
}