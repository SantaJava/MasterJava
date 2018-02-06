package edu.iot.contact.model;
import java.util.Date;

public class Member {
	// field
	private String name;
	private String cellPhone; // 개인정보 동의
	private String address; // 개인정보 동의
	private MemberLevel level;
	private String userId;
	private String password; // 암호화 해서 저장해야함. (누구도 패스워드를 유추할 수 없게끔)
	private Date regDate; // 등록일
	private Date updateDate; // 수정일

	// Constructor
	public Member() {
		super();
	}

	public Member(String name, String cellPhone, String address, String userId, String password, MemberLevel level) {
		super();
		this.name = name;
		this.cellPhone = cellPhone;
		this.address = address;
		this.userId = userId;
		this.password = password;
		this.level = level;
	}

	// Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public MemberLevel getLevel() {
		return level;
	}

	public void setLevel(MemberLevel level) {
		this.level = level;
	}

	// Override hashCode/ equals. for the lacking equal info on default equal
	// method.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	// toStringMethod
	@Override
	public String toString() {
		return "Member [name=" + name + ", cellPhone=" + cellPhone + ", address=" + address + ", level=" + level
				+ ", userId=" + userId + ", password=" + password + ", regDate=" + regDate + ", updateDate="
				+ updateDate + "]";
	}

}
