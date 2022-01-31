package Linkedlist;

import java.util.ArrayList;
import java.util.Stack;

public class A3 {
public static void main(String[] args) {
	Stack s=new Stack();
	s.push(10);
	s.push(20);
	s.push(30);
	s.push(40);
	System.out.println(s);
	s.pop();
	System.out.println(s);

	System.out.println(s.peek());
	ArrayList a1=new ArrayList(s);
	a1.remove(0);
	System.out.println(a1);
	
}
}
