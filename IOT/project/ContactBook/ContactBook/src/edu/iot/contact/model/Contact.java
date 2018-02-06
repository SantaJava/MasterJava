package edu.iot.contact.model;

public class Contact implements Comparable<Contact>{
	private String name;		//이름
	private String address;		//주소
	private String cellPhone;	//핸드폰 번호
	private String email;		//이메일 주소
	
	
	
	public Contact(){} //생성자1
	//생성자2
	public Contact(String name, String address, String cellPhone, String email) {
		super();
		this.name = name;
		this.address = address;
		this.cellPhone = cellPhone;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//toString	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", address=" + address + ", cellPhone=" + cellPhone + ", email=" + email + "]";
	}
	@Override
	public int compareTo(Contact contact) {
		// TODO Auto-generated method stub
		
		return name.compareTo(contact.name);//이름가지고 정렬을 하겠다는 뜻. 
	}
	
}

