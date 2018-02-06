package edu.iot.contact.command;
import edu.iot.contact.service.ContactBook;

/**
 * 메뉴 항목 실행을 위한 Command인터페이스
 * @author student
 *
 */
/**
 * Command execute
 * @author student
 *
 */
public interface Command{
	void execute(ContactBook cb);	
}
