package edu.iot.contact.service;
import java.util.Arrays;

import edu.iot.contact.model.Contact;
import edu.iot.contact.view.ContactView;

public class ContactBook {
	public final static int BOOK_SIZE = 100; // ����� �Ϲ� �ν��Ͻ� ������ٴ� ���� �����ϴ°� ����
	private Contact[] contactBook; // ����Ʈ�� ��� �迭.
	// ������ : �ʱⰪnull

	public ContactBook() {
		super();

		// �����ڿ��� �̸� �ν��Ͻ��� ������. �迭�� Ư���� ũ�⸦ ����������ϴµ�,
		// �˳��ϰ� ũ�⸦ �����س���.
		// contactBook = new Contact[100]; ������ ���鿡�� ����� �̿��ϴ°� ����.
		// ���
		contactBook = new Contact[BOOK_SIZE];

		for (int i = 0; i < 30; i++) {
			contactBook[i] = new Contact("�ο�" + i, "����� ������ ���" + i, "010-2222-2222", "hong" + i + "@gmail.com");
		}
	}
	
	//getter setter ����.
	public Contact[] getContactBook() {
		return contactBook;
	}

	public void setContactBook(Contact[] contactBook) {
		this.contactBook = contactBook;
	}
	
	public void addContact() {
		ContactView view = ContactView.getInstance();
		Contact contact = view.getNewContact();
		
		int index = findEmptyIndex(); //findEmptyIndex�� ����� ����
		if(index != -1) {
			contactBook[index] = contact;
		}else {
			System.out.println("�� ������ �����ϴ�.");
		}
	}
	
	
	
	public int findEmptyIndex() {
		for(int i = 0; i< BOOK_SIZE; i++) {
			if(contactBook[i] == null) {
				return i; //return�ϸ� ����. 
			}
		} //������ ���´ٴ� ���� �� á��, full�̴� ��� ��.
		return -1;		
	}
	
	
	
	//toString method ����.
	@Override
	public String toString() {
		return "ContactBook [contactBook=" + Arrays.toString(contactBook) + "]";
	}
}
