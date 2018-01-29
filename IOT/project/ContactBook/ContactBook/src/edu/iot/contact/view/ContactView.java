package edu.iot.contact.view;
import java.util.Scanner;

import edu.iot.contact.model.Contact;

//사용자로부터 name, address, cellPhone, email을 받아서 객체를 되돌려줌.
public class ContactView {
	//인스턴스가 여러개 필요할까? 하나만 있으면 됨. Singleton Pattern.
	
	private static ContactView contactView = new ContactView();	
	private ContactView(){	//생성자에는 static키워드를 붙일 수가 없음. 클래스내에서만 쓸 수 있는 private생성자를 생성한다.
	}	
	
	public static ContactView getInstance(){ //인스턴스를 참조하는 변수를 반환.
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
