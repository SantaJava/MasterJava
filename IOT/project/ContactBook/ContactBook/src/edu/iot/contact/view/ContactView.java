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
	//�ν��Ͻ��� ������ �ʿ��ұ�? �ϳ��� ������ ��. Singleton Pattern.
	
	/**
	 *@author Melissa Gu
	 *@version 1.0
	 * 
	 * �ڹ� ��ť��Ʈ�� ���� �ּ��� ��Ÿ����.
	 * ���⿡ Ŭ������ ���� ������ ���ָ� ��.
	 * �ּҷ� �ؽ�Ʈ UI ��� Ŭ����.
	 */
	
	private static ContactView contactView = new ContactView();	
	
	
	
	
	/**
	 * contactView �̱����� ���� private ����Ʈ ������. 
	 */
	private ContactView(){	//�����ڿ��� staticŰ���带 ���� ���� ����. Ŭ������������ �� �� �ִ� private�����ڸ� �����Ѵ�.
	}	
	
	/**
	 * �̱��� ��ü�� ������ ����
	 * 
	 * @return �̱��� ��ü ����
	 */
	public static ContactView getInstance(){ //�ν��Ͻ��� �����ϴ� ������ ��ȯ.
		return contactView;
	}
	
	public String menu[] = {
			"1)��� ����",
			"2)�� ����",
			"3)�߰�",
			"4)����",
			"5)����",
			"6)����",			
	}; //�迭
	
	/**
	 * �տ� �������� ����Ʈ �޴� 
	 * @return ����Ʈ�޴��� ������.
	 */
	public int SelectMenu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("=================");
		System.out.println("�޴��� �����ϼ���");
		System.out.println("=================");
		System.out.println("1)��Ϻ���  2)�󼼺���  3)�߰�  4)����  5)����  6)����");
		int select = sc.nextInt();
		return select;
	}
	
	
	/**
	 * �� ����� �ּҷ� ������ ����ڷκ��� �Է� ����.
	 * @return ����� �Է� �����͸� ������ Contact�ν��Ͻ�
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
