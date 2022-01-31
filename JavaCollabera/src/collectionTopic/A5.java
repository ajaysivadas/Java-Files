package collectionTopic;

import java.util.ArrayList;
import java.util.Iterator;

public class A5 {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<>();
	a1.add(10);
	a1.add(20);
	Iterator i=a1.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
}
}
