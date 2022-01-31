package Inheritence;
class Sample
{
	int a=10;
}
class Demo extends Sample
{
	void disp()
	{
		System.out.println("Hey dear....");
	}
}
public class Single {
	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d.a);
		d.disp();
	}

}
