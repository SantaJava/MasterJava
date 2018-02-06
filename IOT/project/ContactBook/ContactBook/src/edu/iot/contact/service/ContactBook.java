package edu.iot.contact.service;

import java.util.Arrays;
import java.util.Scanner;

import edu.iot.contact.model.Contact;
import edu.iot.contact.view.ContactView;

public class ContactBook {
	public final static int BOOK_SIZE = 100; // 상수는 일반 인스턴스 멤버보다는 먼저 정의하는게 관례
	private static Contact[] contactBook; // 컨텍트를 담는 배열.
	// 생성자 : 초기값null

	public ContactBook() {
		super();

		// 생성자에서 미리 인스턴스를 만들어둠. 배열의 특성상 크기를 지정해줘야하는데,
		// 넉넉하게 크기를 지정해놓음.
		// contactBook = new Contact[100]; 가독성 측면에서 상수를 이용하는게 좋다.
		// 상수
		contactBook = new Contact[BOOK_SIZE];

		for (int i = 0; i < 30; i++) {
			contactBook[i] = new Contact("인우" + i, "서울시 강남구 대로" + i, "010-2222-2222", "hong" + i + "@gmail.com");
		}
		Arrays.sort(contactBook); //이름을 기준으로 정렬.
	}
	

	// getter setter 선정.
	public Contact[] getContactBook() {
		return contactBook;
	}

	public void setContactBook(Contact[] contactBook) {
		this.contactBook = contactBook;
	}

	public void addContact() {
		ContactView view = ContactView.getInstance();
		Contact contact = view.getNewContact();

		int index = findEmptyIndex(); // findEmptyIndex의 결과를 받음
		if (index != -1) {
			contactBook[index] = contact;
		} else {
			System.out.println("빈 공간이 없습니다.");
		}
	}

	public int findEmptyIndex() {
		for (int i = 0; i < BOOK_SIZE; i++) {
			if (contactBook[i] == null) {
				return i; // return하면 종료.
			}
		} // 루프를 끝냈다는 뜻은 꽉 찼다, full이다 라는 뜻.
		return -1;
	}

	public void printList() {
		for (int i = 0; i < BOOK_SIZE; i++) {
			if (contactBook[i] != null) {
				System.out.println(i + "" + contactBook[i].getName() + "" + contactBook[i].getCellPhone() + ""
						+ contactBook[i].getEmail() + "");
			}
		}
		System.out.println("=======================");
		System.out.println("[총" + getCount() + "건]");
	}
	
	public void printContact() {
		System.out.println("대상: ");
		Scanner scanner = new Scanner(System.in);
		int ix = scanner.nextInt();
		if(ix >= 0 && ix < BOOK_SIZE) {
			Contact contact = contactBook[ix];
			System.out.println("======================");
			System.out.println("이	름: " + contact.getName());
			System.out.println("주	소: " + contact.getAddress());
			System.out.println("전화번호:" + contact.getCellPhone());
			System.out.println("email:" + contact.getEmail());
			System.out.println("===================");
		}else {
			System.out.println("유효하지 않은 번호입니다.");
		}
	}

	public int getCount() {
		int total = 0;
		for (int i = 0; i < BOOK_SIZE; i++) {
			if (contactBook[i] != null) {
				total++;
			}
		}
		return total;
	}

	public void deleteContact() {
		System.out.println("삭제할 대상: ");
		Scanner sc = new Scanner(System.in);
		int ix = sc.nextInt();
		Contact contact = contactBook[ix];
		sc.nextLine(); // ??

		if (ix >= 0 && ix < BOOK_SIZE) {
			System.out.println(contact.getName() + "을 정말 삭제할까요?[y/n]");
			String response = sc.nextLine();
			if (response.equals("y")) {
				contactBook[ix] = null;
			}

		} else {
			System.out.println("유효하지 않은 번호입니다.");
		}
	}

	public static void updateContact() {
		System.out.println("수정할 대상 index: ");
		Scanner sc = new Scanner(System.in);
		int ix = sc.nextInt();
		sc.nextLine(); // ?????

		if (ix >= 0 && ix < BOOK_SIZE) {
			Contact contact = contactBook[ix];
			System.out.println("이름: " + contact.getName());
			System.out.println("새이름: ");
			String name = sc.nextLine();
			if (!name.equals("")) {
				contact.setName(name);
			}

			System.out.println("전화번호: " + contact.getCellPhone());
			System.out.println("전화번호: ");
			String cellPhone = sc.nextLine();
			if (!name.equals("")) {
				contact.setCellPhone(cellPhone);
			}

			System.out.println("email: " + contact.getEmail());
			System.out.println("새 email: ");
			String email = sc.nextLine();
			if (!name.equals("")) {
				contact.setEmail(email);
			}
			

		} else {
			System.out.println("유효하지 않습니다.");
		}
	}

	// toString method 생성.
	@Override
	public String toString() {
		return "ContactBook [contactBook=" + Arrays.toString(contactBook) + "]";
	}

}
