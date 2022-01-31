package Linkedlist;

import java.util.LinkedHashSet;

public class A6 {
public static void main(String[] args) {
	LinkedHashSet h=new LinkedHashSet();
	h.add(10);
	h.add(20);
	h.add(10);
	h.add(12.4);
	h.add("hello");
	System.out.println(h);
	System.out.println(h.size());
	for(Object i:h)
	{
		System.out.println(i);
	}
}
}
