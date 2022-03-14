package chap06.lecture.p09getter_setter;

public class Computer {
	// 특별한 이유가 없다면
	// 필드는 private으로 작성
	// public get, set 메소드로 필드값을 변경하거나 읽도록 함
	
	private int ssd; // 읽기 전용
	private int ram; // private : 클래스 내에서만 접근 가능
	
	public Computer() {
		ssd = 1000;
	}
	
	public int getSsd() {
		return this.ssd;
	}
	
	public void setRam(int ram) {
		System.out.println("ram을 변경합니다.");
		if (ram < 0) {
			this.ram = 4;
		} else {
			this.ram = ram;
		}
	}
	
	public int getRam() {
		System.out.println("ram을 읽습니다.");
		return this.ram;
	}
}
