package Inheritence;

public class Mulmain {
public static void main(String[] args) {
	MulA m1=new MulA();
	m1.A1();
	m1.A2();
	MulB obj=m1;
	obj.A1();
	MulC obj1=m1;
	obj1.A2();
}
}
