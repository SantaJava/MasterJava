package ChildProductAndStorage;

public class StorageImpl<T> implements Storage<T> {
	private T[] array;

	public StorageImpl(int capacity) {
		this.array = (T[])(new Object[capacity]); //�ν��Ͻ� ��ü�� ���� Ÿ���ε� ������ TŸ������ �ϰڴ�. 
	}
	
	@Override
	public void add(T item, int index) {
		// TODO Auto-generated method stub
		array[index] = item;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return array[index];
	}
}
