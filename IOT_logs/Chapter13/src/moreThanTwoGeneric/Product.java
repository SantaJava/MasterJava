package moreThanTwoGeneric;

public class Product <T, M>{ //두개 이상의 제네릭을 받는 타입. 매개변수와 비슷하게 생각한다.

	private T kind;
	private M model;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}	
}
