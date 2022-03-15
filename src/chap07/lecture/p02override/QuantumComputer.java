package chap07.lecture.p02override;

public class QuantumComputer extends Computer {
	
	// 메소드 재정의 (method override)
	// 같은 이름(파라미터 타입, 순서, 개수)의 메소드를
	// 하위 클래스에서 다시 정의하는 것
	public void execute() {
		System.out.println("더 빠른 연산을 합니다.");
	}
	
	public void otherExecute() {
		System.out.println("다른 연산을 합니다.");
	}
}
