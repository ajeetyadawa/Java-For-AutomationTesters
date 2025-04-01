package arraysdemo;

public class uniqueTwoArraysElement {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		int [] returnElement= getSum(nums, 9);
		for(int i=0; i<returnElement.length-1;i++ ) {
		System.out.println(returnElement[i]);
		}
	}

	static int[] getSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}

		return new int[] {};
	}
}
