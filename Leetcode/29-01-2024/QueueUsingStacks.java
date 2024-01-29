/*
	
	232. Implement Queue using Stacks :

	Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

	Implement the MyQueue class:

		void push(int x) Pushes element x to the back of the queue.
		int pop() Removes the element from the front of the queue and returns it.
		int peek() Returns the element at the front of the queue.
		boolean empty() Returns true if the queue is empty, false otherwise.
	Notes:

	You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
	Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.



*/



class MyQueue {
    
    Stack<Integer> st1;
    Stack<Integer> st2;

    public MyQueue() {
        
        st1=new Stack<>();
        st2=new Stack<>();
        
    }
    
    public void push(int x) {
        
        st1.push(x);
        
        
        
    }
    
    public int pop() {
        
        while(!st1.isEmpty()){
            
            st2.push(st1.pop());
        }
        
        int val= st2.pop();
        
        while(!st2.isEmpty()){
            
            st1.push(st2.pop());
        }
        
        return val;
        
    }
    
    public int peek() {
        
        while(!st1.isEmpty()){
            
            st2.push(st1.pop());
        }
        
        int val= st2.peek();
        
        while(!st2.isEmpty()){
            
            st1.push(st2.pop());
        }
        
        return val;
    }
    
    public boolean empty() {
        
        return st1.isEmpty() && st2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */