package chap11.lecture.p01object;

public class App02 {
	public static void main(String[] args) {
		Book b1 = new Book("java", 20000);
		
		System.out.println("title : " + b1.getTitle());
		System.out.println("price : " + b1.getPrice());
		
		System.out.println(b1.toString());
		
		Book b2 = new Book("spring", 30000);
		System.out.println(b2.toString());
		
		Book b3 = new Book("jsp", 25000);
		System.out.println(b3.toString());
		
		Object o1 = new Book("vue", 3000);
		System.out.println(o1.toString());
		
		System.out.println(b1);
		System.out.println(b2);
	}
}


class Book {
	private String title;
	private int price;
	
	// toString() : 객체의 정보를 문자열(String)로 리턴하는 메소드
	@Override
	public String toString() {
		String desc = "title : " + title + ", " + "price : " + price;
		return desc;
	}
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}





