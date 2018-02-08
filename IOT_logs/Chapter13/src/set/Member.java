package set;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //instanceof�� ���� ��.
			return false;
		Member other = (Member) obj; //instanceof�� �����Ƿ� �����ϰ� Ÿ��ĳ������ �����ϰ�.�׻��¿��� ���� ����� ����.
		//age�� name�� ������ + null üũ����.
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}

	//�������̵带 ���ϰ� �Ǹ� default�� ������Ʈ�� equals�� �Ἥ, ������ ����� ������ �ȴ�. 
//	@Override
//	public int hashCode() { //�̸��� ���̸� ���� ���� ���ο� �ؽ��ڵ尪���� ����, (�������� ��) �� Integer�� �ִ°�. ���� ������ �׷���. add �Ҷ����� �˻縦 �ؾ��ϱ� ����.
//		return name.hashCode() + age; //���ο� �ؽ��ڵ带 ������ �̸��� ���� age�� ������ ���� ������� ���ڴٴ°�...
//	}
//
//	@Override
//	public String toString() {
//		return "Member [name=" + name + ", age=" + age + "]";
//	}	
	
	
	
}
