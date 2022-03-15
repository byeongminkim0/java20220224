package chap07.lecture.p01inheritance;

public class App01 {
	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.cpu = "펜티엄";
		com1.ram = "32g";
		com1.ssd = "1tb";
		com1.executeGame();
		
		QuantumComputer com2 = new QuantumComputer();
		com2.cpu = "양자cpu";
		com2.ram = "1tb";
		com2.ssd = "32tb";
		com2.executeGame();
		com2.executeQuantum();
		
		System.out.println(com1.cpu);
		System.out.println(com2.cpu);
	}
}
