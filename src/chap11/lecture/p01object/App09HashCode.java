package chap11.lecture.p01object;

public class App09HashCode {
	public static void main(String[] args) {
		Sock sock1 = new Sock("red", 300);
		Sock sock2 = new Sock("red", 200);
		
		System.out.println(sock1.hashCode());
		System.out.println(sock2.hashCode());
		
		System.out.println(sock1.equals(sock2));
	}
}

class Sock {
	private String color;
	private int size;
	
	public Sock(String color, int size) {
		this.color = color;
		this.size = size;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
//		result = prime * result;
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
		Sock other = (Sock) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	
	
}
