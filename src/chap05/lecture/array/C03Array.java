package chap05.lecture.array;

public class C03Array {
	public static void main(String[] args) {
		int[][] arr1 = new int[][] { { 2, 3 }, { 10, 20, 30 }, { 11, 22 } };
		
		System.out.println(arr1[0][0]);
		System.out.println(arr1[1][1]);
		System.out.println(arr1[0][1]); // 3
		System.out.println(arr1[2][0]); // 11
		
		System.out.println("모든 아이템 탐색");
		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println(arr1[i][j]);
			}
		}
	}
}
