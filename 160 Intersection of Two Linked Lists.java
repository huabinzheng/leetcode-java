package leetcode;
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
}
public class Solution {
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        if (lenA > lenB) {
        	for (int i = 0; i < lenA - lenB; i++) headA = headA.next;
        } else {
        	for (int i = 0; i < lenB - lenA; i++) headB = headB.next;
        }
        while (headA != null && headB != null) {
        	if (headA == headB) return headA;
        	headA = headA.next;
        	headB = headB.next;
        }
        return null;
    }
	public static int getLength(ListNode head) {
		int cnt = 1;
		while (head != null) {
			head = head.next;
			cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		ListNode a1 = new ListNode(2);
		ListNode b1 = new ListNode(1);
		ListNode b2 = new ListNode(2); b1.next = b2;
		ListNode c1 = new ListNode(3); 
		a1.next = c1;
		b2.next = c1;
		System.out.println(getIntersectionNode(a1, b1).val);
		
	}
}
