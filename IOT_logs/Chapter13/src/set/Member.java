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
		if (getClass() != obj.getClass()) //instanceof와 같은 뜻.
			return false;
		Member other = (Member) obj; //instanceof가 같으므로 안전하게 타입캐스팅이 가능하고.그상태에서 논리적 동등성을 따짐.
		//age와 name이 같은가 + null 체크까지.
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

	//오버라이드를 안하게 되면 default는 오브젝트의 equals를 써서, 물리적 동등성을 따지게 된다. 
//	@Override
//	public int hashCode() { //이름과 나이를 더한 값을 새로운 해쉬코드값으로 만들어서, (지문같은 것) 을 Integer로 넣는것. 성능 때문에 그런것. add 할때마다 검사를 해야하기 때문.
//		return name.hashCode() + age; //새로운 해쉬코드를 만들자 이름도 같고 age도 같으면 같은 사람으로 보겠다는것...
//	}
//
//	@Override
//	public String toString() {
//		return "Member [name=" + name + ", age=" + age + "]";
//	}	
	
	
	
}
