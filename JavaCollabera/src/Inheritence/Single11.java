package Inheritence;
class AD
{
	int x=8;
}
class AC extends AD
{
	void Fo()
	{
		System.out.println("Hello");
	}
}
public class Single11 {
	public static void main(String[] args) {
		AC a1=new AC();
a1.Fo();
System.out.println(a1.x);
	
	}

}
