package leetcode;
public class Solution {
	public static int rob(int[] nums) {
		int len = nums.length;
		if (len == 0) return 0;
		int[] rob = new int[len];
		int[] notrob = new int[len];
		rob[0] = nums[0];
		notrob[0] = 0;
		for (int i = 1; i < len; i++) {
			rob[i] = notrob[i - 1] + nums[i];
			notrob[i] = Math.max(rob[i - 1], notrob[i - 1]);
		}
		return Math.max(rob[len - 1], notrob[len - 1]);
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(rob(nums));
	}
}
