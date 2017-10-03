package leetcode;
public class Solution {
	public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        left[0] = 1;
        for (int i = 1; i < len; i++)
        	left[i] = left[i - 1] * nums[i - 1];
        int[] right = new int[len];
        right[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--)
        	right[i] = right[i + 1] * nums[i + 1];
        int[] res = new int[len];
        for (int i = 0; i < len; i++)
        	res[i] = left[i] * right[i];
        return res;
    }
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] res = productExceptSelf(nums);
		for (int i = 0;i < res.length; i++)
			System.out.print(res[i] + " ");
	}
}
