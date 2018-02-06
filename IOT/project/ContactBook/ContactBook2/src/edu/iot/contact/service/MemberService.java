package edu.iot.contact.service;

import java.util.ArrayList;
import java.util.List;
import edu.iot.contact.model.Member;
import edu.iot.contact.model.MemberLevel;

public class MemberService {
	List<Member> memberList;

	public MemberService() { //Date는 정보로 넣지 않는다. 
		memberList = new ArrayList<>();
		memberList.add(new Member("admin", "01234", "adminAdress", "admin" + 1, "1234", MemberLevel.ADMIN));

		for (int i = 0; i < 24; i++) {
			if (i % 2 == 1) {
				memberList.add(new Member("Gu" + i, "010-1111-2222", "강남구 역삼동", "인우" + i, "password" + i, MemberLevel.NORMAL));
			} else {
				memberList.add(new Member("Gu" + i, "010-1111-2222", "강남구 역삼동", "인우" + i, "password" + i, MemberLevel.GOLD));
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
		int ix = memberList.indexOf(sample); //id 가 있는지 검사.
			//memberList.size();
		if(ix == -1) { //userId가 없다. 
			throw new InvalidUserIdException(userId + "  is an Invalid ID");			
		}		
		//id 검사후 그 아이디에 해당하는 member를 불러온다.
				
				sample = memberList.get(ix);
				System.out.println(sample);
		
		//비밀번호 검사
		 if(!sample.getPassword().equals(password)) { //비밀번호 불일치		 
			throw new PasswordNotMatchException(password + "  is an Invalid Password");
		}
	}
}





