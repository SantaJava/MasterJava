package edu.iot.contact.service;

import java.util.Arrays;
import java.util.Scanner;

import edu.iot.contact.model.Contact;
import edu.iot.contact.view.ContactView;

public class ContactBook {
	public final static int BOOK_SIZE = 100; // ����� �Ϲ� �ν��Ͻ� ������ٴ� ���� �����ϴ°� ����
	private static Contact[] contactBook; // ����Ʈ�� ��� �迭.
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
		Arrays.sort(contactBook); //�̸��� �������� ����.
	}
	

	// getter setter ����.
	public Contact[] getContactBook() {
		return contactBook;
	}

	public void setContactBook(Contact[] contactBook) {
		this.contactBook = contactBook;
	}

	public void addContact() {
		ContactView view = ContactView.getInstance();
		Contact contact = view.getNewContact();

		int index = findEmptyIndex(); // findEmptyIndex�� ����� ����
		if (index != -1) {
			contactBook[index] = contact;
		} else {
			System.out.println("�� ������ �����ϴ�.");
		}
	}

	public int findEmptyIndex() {
		for (int i = 0; i < BOOK_SIZE; i++) {
			if (contactBook[i] == null) {
				return i; // return�ϸ� ����.
			}
		} // ������ ���´ٴ� ���� �� á��, full�̴� ��� ��.
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
		System.out.println("[��" + getCount() + "��]");
	}
	
	public void printContact() {
		System.out.println("���: ");
		Scanner scanner = new Scanner(System.in);
		int ix = scanner.nextInt();
		if(ix >= 0 && ix < BOOK_SIZE) {
			Contact contact = contactBook[ix];
			System.out.println("======================");
			System.out.println("��	��: " + contact.getName());
			System.out.println("��	��: " + contact.getAddress());
			System.out.println("��ȭ��ȣ:" + contact.getCellPhone());
			System.out.println("email:" + contact.getEmail());
			System.out.println("===================");
		}else {
			System.out.println("��ȿ���� ���� ��ȣ�Դϴ�.");
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
		System.out.println("������ ���: ");
		Scanner sc = new Scanner(System.in);
		int ix = sc.nextInt();
		Contact contact = contactBook[ix];
		sc.nextLine(); // ??

		if (ix >= 0 && ix < BOOK_SIZE) {
			System.out.println(contact.getName() + "�� ���� �����ұ��?[y/n]");
			String response = sc.nextLine();
			if (response.equals("y")) {
				contactBook[ix] = null;
			}

		} else {
			System.out.println("��ȿ���� ���� ��ȣ�Դϴ�.");
		}
	}

	public static void updateContact() {
		System.out.println("������ ��� index: ");
		Scanner sc = new Scanner(System.in);
		int ix = sc.nextInt();
		sc.nextLine(); // ?????

		if (ix >= 0 && ix < BOOK_SIZE) {
			Contact contact = contactBook[ix];
			System.out.println("�̸�: " + contact.getName());
			System.out.println("���̸�: ");
			String name = sc.nextLine();
			if (!name.equals("")) {
				contact.setName(name);
			}

			System.out.println("��ȭ��ȣ: " + contact.getCellPhone());
			System.out.println("��ȭ��ȣ: ");
			String cellPhone = sc.nextLine();
			if (!name.equals("")) {
				contact.setCellPhone(cellPhone);
			}

			System.out.println("email: " + contact.getEmail());
			System.out.println("�� email: ");
			String email = sc.nextLine();
			if (!name.equals("")) {
				contact.setEmail(email);
			}
			

		} else {
			System.out.println("��ȿ���� �ʽ��ϴ�.");
		}
	}

	// toString method ����.
	@Override
	public String toString() {
		return "ContactBook [contactBook=" + Arrays.toString(contactBook) + "]";
	}

}
