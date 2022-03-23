package chap11.lecture.p03wrapper;

public class App06 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 2; // int <= int
		
		Integer i1 = new Integer(999);
		arr[1] = i1; // auto unboxing
		
		// 배열에 double, long, int
		double[] arr1 = new double[3];
		arr1[0] = 3.14;
		arr1[1] = 297432374982734L;
		arr1[2] = 123414;
		
		// 배열에 Double, Long, Integer
		Number[] arr2 = new Number[3];
		arr2[0] = 3.14; // auto boxing
		arr2[1] = 2938749273947L; // auto boxing
		arr2[2] = 12341; // auto boxing
		
		double d1 = (Double) arr2[0]; // auto unboxing
		long l1 = (Long) arr2[1]; // auto unboxing
		int i2 = (Integer) arr2[2]; // auto unboxing
	}
}









