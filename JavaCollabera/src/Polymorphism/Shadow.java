package Polymorphism;
class A
{
	public static void a1()
	{
		System.out.println("super class method");
	}
}
class B extends A
{
	public static void a1()
	{
		System.out.println("sub class method");
	}
}
public class Shadow {
public static void main(String[] args) {
	B b1=new B();
	b1.a1();
	A obj=b1;
	obj.a1();
}
}
