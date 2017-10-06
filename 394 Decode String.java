package leetcode;
public class Solution {
	public static String decodeString(String s) {
		if (s == "") return "";
		String res = "";
        int i = 0;
        while (i < s.length() && s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
        	res += s.charAt(i);
        	i++;
        }
        if (i == s.length()) return res;
        int num = 0;
        while (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
        	num = num * 10 + s.charAt(i) - '0';
        	i++;
        }
        int cnt = 1;
        int j = i + 1;
        while (cnt != 0) {
        	if (s.charAt(j) == '[') cnt++;
        	else if (s.charAt(j) == ']') cnt--;
        	j++;
        }
        String str = decodeString(s.substring(i + 1, j - 1));
        for (int n = 0; n < num; n++)
        	res += str;
        if (j != s.length()) return res + decodeString(s.substring(j));
        else return res;
    }
	public static void main(String[] args) {
		System.out.println(decodeString("3[a]2[bc]"));
		System.out.println(decodeString("3[a2[c]]"));
		System.out.println(decodeString("2[abc]3[cd]ef"));
	}
}
