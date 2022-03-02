package chap99.codingbat;

public class Array1 {
	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}

	public boolean commonEnd(int[] a, int[] b) {
		return (a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]);
	}

	public boolean sameFirstLast(int[] nums) {

		if (nums.length > 0) {
			return nums[0] == nums[nums.length - 1];
		}

		return false;

	}

	public boolean firstLast6(int[] nums) {

		return (nums[0] == 6) || (nums[nums.length - 1] == 6);
	}

}
