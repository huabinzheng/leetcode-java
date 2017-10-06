package leetcode;
public class Solution {
    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
    	int[] len = new int[nums.length];
    	for (int i = 0; i < nums.length; i++)
    		len[i] = 1;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
        	for (int j = 0; j < i; j++) {
        		if (nums[j] < nums[i]) {
        			len[i] = Math.max(len[i], len[j] + 1);
        		}
        	}
        	res = Math.max(res, len[i]);
        }
        return res;
    }	
	public static void main(String[] args) {
		int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
		System.out.println(lengthOfLIS(nums));
	}
}
