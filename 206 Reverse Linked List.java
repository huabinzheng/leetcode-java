package leetcode;
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
public class Solution {
	public static ListNode reverseList(ListNode head) {
		if (head == null) return head;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
        	ListNode next = cur.next;
        	cur.next = pre;
        	pre = cur;
        	cur = next;
        }
        return pre;
    }
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2); n1.next = n2;
		ListNode n3 = new ListNode(3); n2.next = n3;
		ListNode n4 = new ListNode(4); n3.next = n4;
		
		ListNode node = reverseList(n1);
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
}
