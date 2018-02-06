package edu.iot.contact.command;

import edu.iot.contact.service.ContactBook;

public class ExitCommand implements Command {

	@Override
	public void execute(ContactBook cb) {
		// TODO Auto-generated method stub
		System.out.println("종료합니다.");
		System.exit(0); //정상적인 종료를 의미.
	}
}
