package StaticandNonstatic;
class Sample1
{
	static void area()
	{
		int w=5,h=4;
		int result=w*h;
		System.out.println(result);
	}
}
public class Sample {
	public static void main(String[] args) {
		System.out.println("area of rectangle is:");
		Sample1.area();
	}

}
