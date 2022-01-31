package Linkedlist;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class A5 {
public static void main(String[] args) {
	TreeSet t1=new TreeSet();
	t1.add(10);
	t1.add(6);
	t1.add(50);
	t1.add(3);
	System.out.println(t1);
	java.util.Iterator i= t1.descendingIterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
		
	}
	
}
}
