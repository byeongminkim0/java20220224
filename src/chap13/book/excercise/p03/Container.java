package chap13.book.excercise.p03;

public class Container<T, U> {
	private T key;
	private U value;
	
	public void set(T param1, U param2) {
		key = param1;
		value = param2;
	}

	public T getKey() {
		return key;
	}

	public U getValue() {
		return value;
	}
	
}
