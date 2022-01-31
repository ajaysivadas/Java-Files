package Linkedlist;

import java.util.LinkedList;

public class A7 {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.offer(10);
	l.offer(20);
	l.offer("Hello");
	l.offer(20);
	System.out.println(l);
	l.poll();
	System.out.println(l);
	System.out.println(l.peek());
}
}
