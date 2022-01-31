package Linkedlist;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class A9 {
 public  static void main(String[] args) {
	HashMap h=new HashMap();
	h.put(1,"smile");
	h.put(213, "Happy");
	h.put(3, "sad");
	h.put(113,"manga");
	h.put(213, "dinga");
	System.out.println(h);
	TreeMap<Integer,String>l1=new TreeMap<Integer,String>();
	l1.put(11,"Ravi");
	l1.put(13, "Raju");
	l1.put(14,"Rama");
	for(Map.Entry<Integer,String> entry : l1.entrySet())
	{
	System.out.println(entry.getKey()+" "+entry.getValue());	
	}
}
}
