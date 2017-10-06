package leetcode;
import java.util.*;
public class Solution {
    public static String convert(String s, int numRows) {
        int row = 0;
        int dir = 1;
        if (numRows == 1) return s;
        StringBuffer[] lines = new StringBuffer[numRows];
        for (int i = 0; i < numRows; i++)
        	lines[i] =  new StringBuffer("");
        for (int i = 0; i < s.length(); i++) {
        	lines[row].append(s.charAt(i));
        	row += dir;
        	if (row == 0) dir = 1;
        	else if (row == numRows - 1) dir = -1;
        }
        StringBuffer res = new StringBuffer("");
        for (int i = 0; i < numRows; i++)
        	res.append(lines[i].toString());
        return res.toString();
    }
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 2));
	}
}
