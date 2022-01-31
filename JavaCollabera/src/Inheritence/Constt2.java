package Inheritence;

class Da
{
	Da()
	{
		System.out.println("Hey  Biriyani");
	}
	Da(int a)
	{
		System.out.println("hey Kabab");
	}
}
class Dee extends Da
{
	Dee()
	{
		System.out.println("Hey Chicken 65");
	}
	Dee(double c)
	{
		super(12);
		System.out.println("Hey I am chicken");
	}
}
public class Constt2 {
	public static void main(String[] args) {
		Dee d1=new Dee();
		Dee d2=new Dee(1.2);
	}
}