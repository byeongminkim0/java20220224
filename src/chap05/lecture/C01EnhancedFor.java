package chap05.lecture;

public class C01EnhancedFor {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("그냥 for");
		}

		int[] arr1 = { 100, 200, 300, 400, 150 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		for (int item : arr1) {
			System.out.println(item);
			System.out.println("코드 반복!!");
		}
	}
}





