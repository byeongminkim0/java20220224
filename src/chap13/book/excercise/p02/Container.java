package chap13.book.excercise.p02;

public class Container<T> {
	private T field;
	
	public void set(T param) {
		field = param;
	}

	public T get() {
		return field;
	}

}
