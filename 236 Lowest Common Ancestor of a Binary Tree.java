package leetcode;
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
public class Solution {
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        if (left == null) return right;
        else return left;
    }
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(3);
		TreeNode n2 = new TreeNode(5); n1.left = n2;
		TreeNode n3 = new TreeNode(1); n1.right = n3;
		TreeNode n4 = new TreeNode(6); n2.left = n4;
		TreeNode n5 = new TreeNode(2); n2.right = n5;
		TreeNode n6 = new TreeNode(0); n3.left = n6;
		TreeNode n7 = new TreeNode(8); n3.right = n7;
		TreeNode n8 = new TreeNode(7); n5.left = n8;
		TreeNode n9 = new TreeNode(4); n5.right = n9;
		System.out.println(lowestCommonAncestor(n1, n2, n3).val);
	}
}
