package Typecasting;

public class Upmain {
public static void main(String[] args) {
	UP2 u1=new UP2();
	System.out.println(u1.i);
	System.out.println(u1.j);
	UP1 u2=new UP1();
	System.out.println(u2.i);
	System.out.println(u1);
	UP1 u3=u1;
	System.out.println(u3.i);
	System.out.println(u3);
	System.out.println(u1);
	
}
}
