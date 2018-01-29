package edu.iot.contact.model;

public class Contact {
	private String name;		//�̸�
	private String address;		//�ּ�
	private String cellPhone;	//�ڵ��� ��ȣ
	private String email;		//�̸��� �ּ�
	
	public Contact(){} //������1
	//������2
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
	
}

