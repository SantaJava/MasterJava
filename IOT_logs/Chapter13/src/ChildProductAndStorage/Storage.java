package ChildProductAndStorage;

public interface Storage<T> {
	public void add(T iten, int index);
	public T get(int index);
}
