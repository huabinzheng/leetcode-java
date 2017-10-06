package leetcode;
import java.util.*;
public class Solution {
	public static boolean equals(int[] a, int[] b) {
		for (int i = 0; i < 26; i++)
			if (a[i] != b[i]) return false;
		return true;
	}
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length() > s.length()) return res;
        int[] p_cnt = new int[26];
        int[] s_cnt = new int[26];
        for (int i = 0; i < p.length(); i++) {
        	p_cnt[p.charAt(i) - 'a']++;
        	s_cnt[s.charAt(i) - 'a']++;
        }
        if (equals(p_cnt,s_cnt)) res.add(0);
        for (int i = p.length(); i < s.length(); i++) {
        	s_cnt[s.charAt(i) - 'a']++;
        	s_cnt[s.charAt(i - p.length()) - 'a']--;
        	if (equals(p_cnt,s_cnt)) res.add(i - p.length() + 1);
        }
        return res;
    }
	public static void main(String[] args) {
		System.out.println(findAnagrams("cbaebabacd", "abc"));
		System.out.println(findAnagrams("abab", "ab"));
	}
}
