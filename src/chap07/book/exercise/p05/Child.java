package chap07.book.exercise.p05;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	
}
