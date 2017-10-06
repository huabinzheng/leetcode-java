package leetcode;
public class Solution {
    public static int findTargetSumWays(int[] nums, int S) {
        return helper(nums, S, 0, 0);
    }
    public static int helper(int[] nums, int S, int start, int sum) {
    	if (start == nums.length) {
    		if (S == sum) return 1;
    		else return 0;
    	}
    	return helper(nums, S, start + 1, sum + nums[start]) + helper(nums, S, start + 1, sum - nums[start]);
    }
	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 1, 1};
		System.out.println(findTargetSumWays(nums, 3));
	}
}
