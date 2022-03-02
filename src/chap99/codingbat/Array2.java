package chap99.codingbat;

public class Array2 {
	public int sum13(int[] nums) {
		int sum = 0;
		boolean is13 = false;
		boolean was13 = false;

		for (int i = 0; i < nums.length; i++) {

			is13 = nums[i] == 13;

			if (!was13 && !is13) {
				sum += nums[i];
			}

			was13 = is13;
		}

		return sum;
	}

	public int centeredAverage(int[] nums) {
		int sum = 0;
		int max = nums[0];
		int min = nums[0];

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			max = (max < nums[i]) ? nums[i] : max;
			min = (min > nums[i]) ? nums[i] : min;
		}

		sum -= max;
		sum -= min;

		return sum / (nums.length - 2);
	}

	public int bigDiff(int[] nums) {
		int max = nums[0];
		int min = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}

			if (min > nums[i]) {
				min = nums[i];
			}
		}

		return max - min;
	}

	public int countEvens(int[] nums) {
		int cnt = 0;

		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] % 2) == 0) {
				cnt++;
			}
		}

		return cnt;
	}

}
