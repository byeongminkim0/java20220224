package chap05.lecture.array;

public class C04Array {
	public static void main(String[] args) {
		int[][] arr1 = new int[3][];
		
		System.out.println(arr1.length);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		arr1[0] = new int[3];
		System.out.println(arr1[0][0]);
		System.out.println(arr1[0][1]);
		System.out.println(arr1[0][2]);
		
//		System.out.println(arr1[1][0]);
		
		arr1[1] = new int[3];
		arr1[2] = new int[3];
		
		// 
		// 3행 4열 행렬 
		int[][] arr2 = new int[3][4];
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		System.out.println(arr2[2].length);

		arr2[0][0] = 3;
		arr2[0][1] = 4;
		arr2[0][2] = 5;
		arr2[0][3] = 6;
		
		arr2[1][0] = 7;
		arr2[1][1] = 8;
		arr2[1][2] = 9;
		arr2[1][3] = 10;
		
		arr2[2][0] = 11;
		arr2[2][1] = 12;
		arr2[2][2] = 13;
		arr2[2][3] = 14;
		
		System.out.println("3X4 행렬 탐색");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
	}
}







