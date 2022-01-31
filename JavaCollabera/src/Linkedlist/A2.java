package Linkedlist;

import java.util.Vector;

public class A2 {
public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add("hello");
		System.out.println(v);
		v.removeElement("hello");
		System.out.println(v);
		System.out.println(v.elementAt(2));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
}
}
