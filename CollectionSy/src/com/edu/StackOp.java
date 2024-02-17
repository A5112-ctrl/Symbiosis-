package com.edu;

import java.util.Stack;

public class StackOp {
public static void main(String[] args) {
	Stack stack=new Stack();
	System.out.println("Before Capacity :"+stack.capacity());	//initial capacity is 10
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	System.out.println("After pushing elements: "+stack);
	stack.pop();
	System.out.println("After poping a elements: "+stack);
	System.out.println("Search element : "+stack.search(20));
	System.out.println("Peek Of the stack :"+stack.peek());
	System.out.println("Check Stack Empty or not : "+stack.empty());
	for(int i=0;i<10;i++) {
		stack.push(i);
	}
	System.out.println(stack);
	System.out.println("After Capacity :"+stack.capacity());
}
}
