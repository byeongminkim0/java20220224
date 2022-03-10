package chap99.leetcode;

class Solution1480 {
	public int[] runningSum(int[] nums) {
		int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				result[i] = nums[i];
			} else {
				result[i] = result[i - 1] + nums[i];
			}
		}

		return result;
	}
}
