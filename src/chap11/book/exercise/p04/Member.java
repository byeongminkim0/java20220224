package chap11.book.exercise.p04;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// toString
	@Override
	public String toString() {
		return id + ": " + name;
	}

}
