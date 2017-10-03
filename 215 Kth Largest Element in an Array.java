package leetcode;
public class Solution {
	public static int findKthLargest(int[] nums, int k) {
        return quicksort(nums, k, 0, nums.length - 1);
    }
	public static int quicksort(int[] nums, int k, int lo, int hi) {
		if (lo >= hi) return nums[hi];
        int mid = partition(nums, lo, hi);
        if (mid == k - 1) return nums[mid];
        else if (mid > k - 1) return quicksort(nums, k, lo, mid - 1);
        else return quicksort(nums, k, mid + 1, hi);
	}
	public static void swap(int[] nums, int i, int j) {
		int tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
	}
	public static int partition(int[] nums, int lo, int hi) {
		int pivot = nums[lo];
		int i = lo; int j = hi + 1;
		while (true) {
			while (nums[++i] > pivot) if (i == hi) break;
			while (nums[--j] < pivot) if (j == lo) break;
			if (i >= j) break;
			swap(nums, i , j);
		}
		swap(nums, lo, j);
		return j;
	}
	public static void main(String[] args) {
		int[] nums = {2,1};
		System.out.println(findKthLargest(nums, 1));
	}
}
