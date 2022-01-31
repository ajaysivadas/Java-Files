package Linkedlist;

import java.util.LinkedList;

public class A1 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(30);
	l1.add(20);
	l1.add(40);
	System.out.println(l1);
	l1.addFirst(10);
	System.out.println(l1);
	l1.add(80);
	System.out.println(l1);
	l1.add(1,59);
	System.out.println(l1);
	l1.removeFirst();
	System.out.println(l1);
	l1.removeLast();
	System.out.println(l1);
	
	System.out.println(l1.getFirst());
	
	System.out.println(l1.getLast());
}
}
