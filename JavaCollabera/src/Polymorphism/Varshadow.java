package Polymorphism;
class A2
{
	static int a=10;
	int b=20;
}
class B2 extends A2
{
	static int b=30;
	int a=40;
}
public class Varshadow {
public static void main(String[] args) {
	B2 b1=new B2();
	System.out.println(b1.a);
	System.out.println(b1.b);
	A2 obj=b1;
	System.out.println(obj.a);
	System.out.println(obj.b);
}

}
