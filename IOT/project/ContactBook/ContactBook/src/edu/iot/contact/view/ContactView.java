package edu.iot.contact.view;
import java.util.Scanner;

import edu.iot.contact.model.Contact;

//����ڷκ��� name, address, cellPhone, email�� �޾Ƽ� ��ü�� �ǵ�����.
public class ContactView {
	//�ν��Ͻ��� ������ �ʿ��ұ�? �ϳ��� ������ ��. Singleton Pattern.
	
	private static ContactView contactView = new ContactView();	
	private ContactView(){	//�����ڿ��� staticŰ���带 ���� ���� ����. Ŭ������������ �� �� �ִ� private�����ڸ� �����Ѵ�.
	}	
	
	public static ContactView getInstance(){ //�ν��Ͻ��� �����ϴ� ������ ��ȯ.
		return contactView;
	}
	
	public Contact getNewContact(){
		Contact contact = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name : " );
		String name = sc.nextLine();
		
		System.out.println("Address : " );
		String address = sc.nextLine();
		
		System.out.println("CellNumber : " );
		String cellPhone = sc.nextLine();
		
		System.out.println("e-Mail: " );
		String email = sc.nextLine();
		
		contact = new Contact(name, address, cellPhone, email);	
		return contact;
	}
}
