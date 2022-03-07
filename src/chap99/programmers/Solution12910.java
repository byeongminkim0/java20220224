package chap99.programmers;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Solution12910 {

	@Test // ctrl + shift + o
	public void test() {
		assertArrayEquals(new int[] { 5, 10 }, solution(new int[] { 5, 9, 7, 10 }, 5));
		assertArrayEquals(new int[] { 1, 2, 3, 36 }, solution(new int[] { 2, 36, 1, 3 }, 1));
		assertArrayEquals(new int[] { -1 }, solution(new int[] { 3, 2, 6 }, 10));
	}

	public int[] solution(int[] arr, int divisor) {
		int[] answer = new int[arr.length];

		int i = 0;
		int j = 0;

		while (i < arr.length) {

			if ((arr[i] % divisor) == 0) {
				answer[j] = arr[i];
				j++;
			}

			i++;
		}

		if (j == 0) {
			return new int[] { -1 };
		}

		int[] answer2 = Arrays.copyOf(answer, j);

		Arrays.sort(answer2);

		return answer2;
	}
}
