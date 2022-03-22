package chap11.lecture.p01object;

public class App08HashCode {
	public static void main(String[] args) {
		Mouse a1 = new Mouse("lg", 3000);
		Mouse a2 = new Mouse("ss", 5000);
		Mouse a3 = new Mouse("lg", 4000);
		Mouse a4 = new Mouse("lg", 3000);
		Mouse a5 = new Mouse("ss", 5000);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a4.hashCode());
		System.out.println(a5.hashCode());
		
		System.out.println(a1.equals(a4)); // true
		System.out.println(a2.equals(a5)); // true
	}
}

class Mouse {
	private String model;
	private int price;
	
	public Mouse(String model, int price) {
		this.model = model;
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mouse other = (Mouse) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	
}
