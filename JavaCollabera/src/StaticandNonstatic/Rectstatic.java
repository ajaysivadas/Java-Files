package StaticandNonstatic;
class Rect1
{
	static void area()
	{
		int w=4,h=6;
		int res=w*h;
		System.out.println(" area of rectangle: "+res);
			}
}
public class Rectstatic {
	public static void main(String[] args) {
Rect1.area();	
	}
}
