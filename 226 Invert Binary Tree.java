package leetcode;
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
public class Solution {
	public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(4);
		TreeNode n2 = new TreeNode(2); n1.left = n2;
		TreeNode n3 = new TreeNode(7); n1.right = n3;
		TreeNode n4 = new TreeNode(1); n2.left = n4;
		TreeNode n5 = new TreeNode(3); n2.right = n5;
		TreeNode n6 = new TreeNode(6); n3.left = n6;
		TreeNode n7 = new TreeNode(9); n3.right = n7;
		TreeNode root = invertTree(n1);
		System.out.println(root.left.left.val);
	}
}
