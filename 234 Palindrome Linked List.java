package leetcode;
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
public class Solution {
	public static boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
        	slow = slow.next;
        	fast = fast.next.next;
        }
        ListNode pre = null;
        ListNode cur = slow.next;
        while (cur != null) {
        	ListNode next = cur.next;
        	cur.next = pre;
        	pre = cur;
        	cur = next;
        }
        while (pre != null) {
        	if (pre.val != head.val) return false;
        	pre = pre.next;
        	head = head.next;
        }
        return true;
    }
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2); n1.next = n2;
		ListNode n3 = new ListNode(3); n2.next = n3;
		ListNode n4 = new ListNode(2); n3.next = n4;
		ListNode n5 = new ListNode(1); n4.next = n5;
		System.out.println(isPalindrome(n1));
	}
}
