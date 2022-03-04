package chap05.lecture.reftype;

public class C06ReferenceType {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 3, 2, 1 };
		method1(arr1);
		System.out.println(arr1[0]);

		int[] arr2 = new int[] { -3, -2, -1 };
		method1(arr2);
		System.out.println(arr2[0]);
	}

	public static void method1(int[] arr) {
		arr[0] = 30;
	}
}
