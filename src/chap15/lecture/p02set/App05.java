package chap15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class App05 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add(new String("java"));
		set1.add(new String("java"));
		System.out.println(set1);
		
		Set<Car> set2 = new HashSet<>();
		set2.add(new Car("tesla"));
		set2.add(new Car("tesla"));
		System.out.println(set2.size()); // 2
		System.out.println(set2);
	}
}

class Car {
	private String model;
	
	Car(String model) {
		this.model = model;
	}
	
	

	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	
}






