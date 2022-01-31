package constructors;

public class Ester {
	Ester(int a)
	{
	System.out.println(a);
	
	}
Ester(double c,int b)
{
	System.out.println(c+"  "+b);
}
Ester(double a)
{
	System.out.println(a);
}
public static void main(String[] args) {
	Ester e1=new Ester(10);
	Ester e2=new Ester(5.5,6);
	Ester e3=new Ester(10.6);
}
}
