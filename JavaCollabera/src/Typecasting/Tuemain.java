package Typecasting;

public class Tuemain {
public static void main(String[] args) {
	Tue1 t1=new Tue2();
	Tue2 t2=(Tue2)t1;
	System.out.println(t2.i);
	System.out.println(t2.j);
	Tue1 t3=new Tue3();
	Tue3 t4=(Tue3)t3;
	System.out.println(t4.i);
	System.out.println(t4.j);
	System.out.println(t4.k);
}
}
