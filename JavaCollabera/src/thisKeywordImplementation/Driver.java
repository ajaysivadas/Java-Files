package thisKeywordImplementation;
class A
{
	int a;
	int b;
	int c;
	void add(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		int sum=a+b+c;
		System.out.println("Sum:"+sum);
	}
}
public class Driver {
public static void main(String[] args) {
	A a1=new A();
	a1.a=10;
	a1.b=20;
	a1.c=30;
	System.out.println(a1.a);
	System.out.println(a1.b);
	System.out.println(a1.c);
	a1.add(10, 20, 30);
}
}
