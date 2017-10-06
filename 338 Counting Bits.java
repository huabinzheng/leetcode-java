package leetcode;
public class Solution {
	public static int[] countBits(int num) {
        if (num == 0) return new int[]{0};
        int[] bits = new int[num + 1];
        bits[0] = 0;
        bits[1] = 1;
        int offset = 1;
        for (int i = 2; i <= num; i++) {
        	if (i == offset * 2) offset *= 2;
        	bits[i] = bits[i - offset] + 1;
        }
        return bits;
    }
	public static void main(String[] args) {
		int[] bits = countBits(8);
		for (int i = 0; i < bits.length; i++)
			System.out.print(bits[i] + " ");
	}
}
