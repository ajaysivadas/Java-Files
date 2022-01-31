package Linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class A4 {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(10);
	h.add(20);
	h.add(40);
	h.add(20);
	System.out.println(h.size());
	System.out.println(h);
	ArrayList a=new ArrayList(h);
	Collections.sort(a);
	System.out.println(a);
}
}
