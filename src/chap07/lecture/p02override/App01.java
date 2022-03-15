package chap07.lecture.p02override;

public class App01 {
	public static void main(String[] args) {
		QuantumComputer c1 = new QuantumComputer();
		c1.execute();
		c1.otherExecute();
		
		Computer c2 = new Computer();
		c2.execute();
//		c2.otherExecute(); // xxx
	}
}
