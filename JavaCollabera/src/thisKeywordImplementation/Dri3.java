package thisKeywordImplementation;

class C
{
	static int a;
	static int b;
	static int c;
	static void add(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("sum:"+sum);
	}
}
public class Dri3 {
	public static void main(String[] args) {
		C c1=new C();
		c1.a=10;
		c1.b=20;
		c1.c=30;
		C c2=new C();
	   	C.add(10, 20, 30);
		System.out.println(c2.b);
		
				
	}

}
