package chap13.lecture.p01generic;

public class App03 {
	public static void main(String[] args) {
		Container3<String> con1 = new Container3<String>();
		con1.setContent("java");
//		con1.setContent(1); //x
		String str1 = con1.getContent(); // cast 필요없음
		
		Container3<Integer> con2 = new Container3<Integer>();
		con2.setContent(333);
		int i1 = con2.getContent();
	}
}

// 삼각괄호 : type parameter
// 명명관습 : 대문자 한글자
// 인스턴스 만들 때 type parameter에 작성한 타입으로 클래스 내부의 타입이 결정

// type parameter가 있는 타임 : generic type
class Container3<T> {
	private T content;
	
	public T getContent() {
		return content;
	}
	
	public void setContent(T content) {
		this.content = content;
	}
}
