package edu.iot.contact.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import edu.iot.contact.model.Member;
import edu.iot.contact.model.MemberLevel;
import edu.iot.contact.util.AscendingMemberLevel;

public class MemberService {
	List<Member> memberList;

	public MemberService() { // Date는 정보로 넣지 않는다.
		memberList = new ArrayList<>();
		memberList.add(new Member("admin", "01234", "adminAdress", "admin" + 1, "1234", MemberLevel.ADMIN));

		for (int i = 0; i < 24; i++) {
			if (i % 2 == 1) {
				memberList.add(
						new Member("Gu" + i, "010-1111-2222", "강남구 역삼동", "인우" + i, "password" + i, MemberLevel.NORMAL));
			} else {
				memberList.add(
						new Member("Gu" + i, "010-1111-2222", "강남구 역삼동", "인우" + i, "password" + i, MemberLevel.GOLD));
			}
		}
	}

	public List<Member> getMemberList() {
		return memberList;
	}

	// 필터링 작업. 멤버 레벨을 받아서 그와 같은 레벨을 가지는 멤버들을 모은 어레이 리스트를 리턴한다.
	public List<Member> getMemberLevel(MemberLevel level, Comparator<Member> order) {
		List<Member> list = new ArrayList<>();
		// 멤버레벨을 담을 새로운 리스트 준비. 인스턴스는 따로 있고, 참조만 생성되서 어레이에 들어감.
		for (Member m : memberList) {
			if (level == null || m.getLevel() == level) {
				// null이거나, level이거나. null이면 그 뒤 연산을 안하고 넘어가고 true로 평가함. \
				// null이아니면 뒤에 까지 검사.
				list.add(m);
			}
		}
		if (order != null) {
			list.sort(order); // 멤버가 Sort의 객체로 넣어지게 된다.
		}
		return list;
	}

	public Member login(String userId, String password) throws InvalidUserIdException, PasswordNotMatchException {
		Member sample = new Member();
		sample.setUserId(userId);
		// sample.setPassword(password);
		int ix = memberList.indexOf(sample); // id 가 있는지 검사.
		// memberList.size();
		if (ix == -1) { // userId가 없다.
			throw new InvalidUserIdException(userId + "  is an Invalid ID");
		}
		// id 검사후 그 아이디에 해당하는 member를 불러온다.
		sample = memberList.get(ix);
		System.out.println(sample);
		// 비밀번호 검사
		if (!sample.getPassword().equals(password)) { // 비밀번호 불일치
			throw new PasswordNotMatchException(password + "  is an Invalid Password");
		}
		return sample;
	}
}
