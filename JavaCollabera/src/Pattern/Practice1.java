package Pattern;

public class Practice1 {
	
	Practice1(int a)
	{
		System.out.println(a);
	
	}
	Practice1(String a,int b)
	{
	System.out.println(a+" "+b);	
	}
	Practice1(double a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		Practice1 p1=new Practice1(10);
		Practice1 p2=new Practice1("sad",20);
		Practice1 p3=new Practice1(10.3);
	}

}
