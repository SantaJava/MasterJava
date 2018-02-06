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
		// 실패했을 시 실패를 알려주는 코드
		Contact[] contacts = contactBook.getContactBook(); // 다른 변수로 받음.

		if (contacts.length != ContactBook.BOOK_SIZE) {
			System.out.println("배열의 초기 크기가 잘못됐습니다.");
		}

		int count = 0;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i] != null) {
				count++;
			}
		}

		if (count != 30) {
			System.out.println("초기 실제 데이터 개수가 잘못 됬습니다.");
		}
		System.out.println("ContactBook 생성 테스트 완료.");
	}
	
	public static void testFindEmptyIndex() {
		ContactBook contactBook = new ContactBook();
		int index = contactBook.findEmptyIndex();
		//System.out.println(index); //30까지 차 있고 30이 리턴됨. 
		if(index == -1) {
			System.out.println("인덱스 찾기 에러");
		}
		System.out.println("findEmptyIndex 테스트 완료");
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
			System.out.println("추가 실패");
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