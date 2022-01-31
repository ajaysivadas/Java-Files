package collectionTopic;

import java.util.ArrayList;
import java.util.Collections;

public class A7 {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<>();
	a1.add(10);
	a1.add(4);
	a1.add(7);
	a1.add(9);
	Collections.sort(a1);
	System.out.println(a1);
	Collections.reverse(a1);
	System.out.println(a1);
	System.out.println(a1.contains(4));
	
}
}
