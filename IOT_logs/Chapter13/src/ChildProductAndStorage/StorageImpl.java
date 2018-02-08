package ChildProductAndStorage;

public class StorageImpl<T> implements Storage<T> {
	private T[] array;

	public StorageImpl(int capacity) {
		this.array = (T[])(new Object[capacity]); //인스턴스 자체는 옵젝 타입인데 참조는 T타입으로 하겠다. 
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
