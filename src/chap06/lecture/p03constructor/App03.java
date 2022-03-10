package chap06.lecture.p03constructor;

public class App03 {
	public static void main(String[] args) {
		Computer com1 = new Computer("intel", "16gb", "1tb");
		Computer com2 = new Computer("amd", "8gb");
		
		com2.ssd = "2tb";
	}
}
