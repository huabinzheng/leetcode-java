package leetcode;
public class Solution {
	public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int ptr = 0;
        for (int i = 0; i < len; i++) {
        	if (nums[i] != 0) {
        		nums[ptr] = nums[i];
        		ptr++;
        	}
        }
        for (int i = ptr; i < len; i++) {
        	nums[i] = 0;
        }
    }
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		for (int i = 0;i < nums.length; i++)
			System.out.print(nums[i] + " ");
	}
}
