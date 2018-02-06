package edu.iot.contact.service;

import java.util.ArrayList;
import java.util.List;
import edu.iot.contact.model.Member;
import edu.iot.contact.model.MemberLevel;

public class MemberService {
	List<Member> memberList;

	public MemberService() { //Date�� ������ ���� �ʴ´�. 
		memberList = new ArrayList<>();
		memberList.add(new Member("admin", "01234", "adminAdress", "admin" + 1, "1234", MemberLevel.ADMIN));

		for (int i = 0; i < 24; i++) {
			if (i % 2 == 1) {
				memberList.add(new Member("Gu" + i, "010-1111-2222", "������ ���ﵿ", "�ο�" + i, "password" + i, MemberLevel.NORMAL));
			} else {
				memberList.add(new Member("Gu" + i, "010-1111-2222", "������ ���ﵿ", "�ο�" + i, "password" + i, MemberLevel.GOLD));
			}
		}
	}

	public List<Member> getMemberList() {
		return memberList;
	}
	
	public void login(String userId, String password) throws InvalidUserIdException, PasswordNotMatchException{
		Member sample = new Member();
		sample.setUserId(userId);
	//	sample.setPassword(password);		
		int ix = memberList.indexOf(sample); //id �� �ִ��� �˻�.
			//memberList.size();
		if(ix == -1) { //userId�� ����. 
			throw new InvalidUserIdException(userId + "  is an Invalid ID");			
		}		
		//id �˻��� �� ���̵� �ش��ϴ� member�� �ҷ��´�.
				
				sample = memberList.get(ix);
				System.out.println(sample);
		
		//��й�ȣ �˻�
		 if(!sample.getPassword().equals(password)) { //��й�ȣ ����ġ		 
			throw new PasswordNotMatchException(password + "  is an Invalid Password");
		}
	}
}





