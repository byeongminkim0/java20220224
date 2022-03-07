package chap99.programmers;

public class Solution12935 {
	public int[] solution(int[] arr) {
		if (arr.length == 1) {
			return new int[] { -1 };
		}

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		int[] answer = new int[arr.length - 1];

		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] != min) {
				answer[j] = arr[i];
				j++;
			}
		}

		return answer;
	}
}
