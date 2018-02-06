package edu.iot.contact.view;
import java.util.Scanner;

import edu.iot.contact.model.Contact;

	
/**
 * @author student
 *
 */
/**
 * @author student
 *
 */
public class ContactView {
	//인스턴스가 여러개 필요할까? 하나만 있으면 됨. Singleton Pattern.
	
	/**
	 *@author Melissa Gu
	 *@version 1.0
	 * 
	 * 자바 도큐먼트를 위한 주석을 나타낸다.
	 * 여기에 클래스에 대한 설명을 써주면 됨.
	 * 주소록 텍스트 UI 담당 클래스.
	 */
	
	private static ContactView contactView = new ContactView();	
	
	
	
	
	/**
	 * contactView 싱글톤을 위한 private 디폴트 생성자. 
	 */
	private ContactView(){	//생성자에는 static키워드를 붙일 수가 없음. 클래스내에서만 쓸 수 있는 private생성자를 생성한다.
	}	
	
	/**
	 * 싱글톤 객체의 참조를 리턴
	 * 
	 * @return 싱글톤 객체 참조
	 */
	public static ContactView getInstance(){ //인스턴스를 참조하는 변수를 반환.
		return contactView;
	}
	
	public String menu[] = {
			"1)목록 보기",
			"2)상세 보기",
			"3)추가",
			"4)수정",
			"5)삭제",
			"6)종료",			
	}; //배열
	
	/**
	 * 앞에 보여지는 셀렉트 메뉴 
	 * @return 셀렉트메뉴를 리턴함.
	 */
	public int SelectMenu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("=================");
		System.out.println("메뉴를 선택하세요");
		System.out.println("=================");
		System.out.println("1)목록보기  2)상세보기  3)추가  4)수정  5)삭제  6)종료");
		int select = sc.nextInt();
		return select;
	}
	
	
	/**
	 * 한 사람의 주소록 정보를 사용자로부터 입력 받음.
	 * @return 사용자 입력 데이터를 가지는 Contact인스턴스
	 */
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
