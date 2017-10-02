package leetcode;
public class Solution {
	public static int majorityElement(int[] nums) {
         int len = nums.length;
         int num = 0;
         int cnt = 0;
         for (int i = 0; i < len; i++) {
        	 if (cnt == 0) {
        		 num = nums[i];
        		 cnt++;
        	 } else if (num != nums[i]) {
        		 cnt--;
        	 } else if (num == nums[i]) {
        		 cnt++;
        	 }
         }
         return num;
    }
	public static void main(String[] args) {
		int[] nums = {1,1,3,2,1};
		System.out.println(majorityElement(nums));
	}
}
