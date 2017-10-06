package leetcode;
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
public class Solution {
	public static int res = 0;
    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        depth(root);
        return res;
    }
    public static int depth(TreeNode root) {
    	if (root == null) return 0;
    	int left = depth(root.left);
    	int right = depth(root.right);
    	res = Math.max(res, left + right);
    	return Math.max(left, right) + 1;
    }
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2); n1.left = n2;
		TreeNode n3 = new TreeNode(3); n1.right = n3;
		TreeNode n4 = new TreeNode(4); n2.left = n4;
		TreeNode n5 = new TreeNode(5); n2.right = n5;
		TreeNode n6 = new TreeNode(6); n3.left = n6;
		System.out.println(diameterOfBinaryTree(n1));
	}
}
