package edu.iot.contact.command;

import edu.iot.contact.service.ContactBook;

public class ExitCommand implements Command {

	@Override
	public void execute(ContactBook cb) {
		// TODO Auto-generated method stub
		System.out.println("�����մϴ�.");
		System.exit(0); //�������� ���Ḧ �ǹ�.
	}
}
