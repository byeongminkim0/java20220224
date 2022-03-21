package chap10.lecture.p06custom;

public class ValueOutOfBoundsException extends Exception {
	public ValueOutOfBoundsException() {
//		super();
	}
	
	public ValueOutOfBoundsException(String message) {
		super(message);
	}
}
