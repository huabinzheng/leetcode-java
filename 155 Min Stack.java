package leetcode;
import java.util.Stack;
class MinStack {
    /** initialize your data structure here. */
	private Stack<Integer> stack;
	private Stack<Integer> minNumber;
    
	public MinStack() {
        stack = new Stack<Integer>();
        minNumber = new Stack<Integer>();
    }
   
    public void push(int x) {
        stack.push(x);
        if (minNumber.isEmpty() || minNumber.peek() >= x) 
        	minNumber.push(x);
    }
    
    public void pop() {
    	int top = stack.pop();
    	if (top == minNumber.peek())
    		minNumber.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minNumber.peek();
    }
}
public class Solution {
	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());   //--> Returns -3.
		minStack.pop();
		System.out.println(minStack.top());      //--> Returns 0.
		System.out.println(minStack.getMin());   //--> Returns -2.
	}
}
