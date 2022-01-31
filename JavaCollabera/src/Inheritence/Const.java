package Inheritence;
class A
{
	A(){
		System.out.println("I am A");
	}
	A(int a)
	{
		System.out.println("I am AA");
	}
}
	class B extends A{
		B(){
		System.out.println("I am B");
	}
		B(int a)
		{
			
			System.out.println("I am BB");
		}
}
public class Const {
public static void main(String[] args) {
	B b1=new B();
	B b2=new B(10);
}
}

	