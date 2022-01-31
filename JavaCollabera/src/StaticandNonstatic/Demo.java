package StaticandNonstatic;

public class Demo{
public static void main(String[] args) {
	System.out.println("area of Square :");
Demo1.area();	
}
}
class Demo1
{
	static void area()
	{
		int a=5;
		int r=a*a;
		System.out.println(r);
	}
}