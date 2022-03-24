package chap13.lecture.p01generic;

public class App01 {
	public static void main(String[] args) {
		Container1 con1 = new Container1();
		con1.setContent("java");
		String str1 = con1.getContent();
		
		
	}
}

class Container1 {
	private String content;
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
}
