package edu.iot.contact;
import edu.iot.contact.command.AddContact;
import edu.iot.contact.command.Command;
import edu.iot.contact.command.DeleteContact;
import edu.iot.contact.command.ExitCommand;
import edu.iot.contact.command.PrintContact;
import edu.iot.contact.command.PrintListCommand;
import edu.iot.contact.command.UpdateContact;
import edu.iot.contact.service.ContactBook;
import edu.iot.contact.view.ContactView;

public class ContactApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Command []commands = {
				
			null,
			new PrintListCommand(),
			new PrintContact(),
			new AddContact(),
			new UpdateContact(),
			new DeleteContact(),
			new ExitCommand()
				
		};
		
		ContactBook contactBook = new ContactBook();
		ContactView view = ContactView.getInstance();
		
		
		while(true) {
			int item = view.SelectMenu();
			if(item >=1 && item <= commands.length) {
				commands[item].execute(contactBook);
			}else {
				System.out.println("�߸� �����߽��ϴ�.");
			}
		}
		
//		while(true) {
//			int item = view.SelectMenu();
//			switch(item) {
//			case 1 : //�迭�� 1234�� ���� �迭�� �̺κ��� �������!
//				contactBook.printList();
//				break;
//			case 2 :
//				contactBook.printContact();
//				break;
//			case 3 : 
//				contactBook.addContact();
//				break;
//			case 4 :
//				contactBook.updateContact();
//				break;
//			case 5 :
//				contactBook.deleteContact();
//				break;
//			case 6 : //����
//				System.out.println("�����մϴ�");
//				return;
//			default:
//				System.out.println("�߸� �����ϼ̽��ϴ�.");
//			}
//		}
	}

}
