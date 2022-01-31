package collectionTopic;

import java.util.ArrayList;

public class A3 {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add("Smile");
	l1.add(10.4);
	System.out.println(l1);
	ArrayList l2=new ArrayList();
	l2.add(40);
	l2.add(90.4);
	l2.add(13);
	System.out.println(l2);
	l2.add(2,65);
	System.out.println(l2);
	l2.addAll(l1);
	System.out.println(l2);
	System.out.println(l2.get(5));
	for(int i=0; i<l2.size(); i++)
	{
		System.out.println(l2.get(i));
	}
	l2.removeAll(l1);
	System.out.println(l2);
	l2.remove(0);
	System.out.println(l2);
	l2.clear();
	System.out.println(l2);
}
}
