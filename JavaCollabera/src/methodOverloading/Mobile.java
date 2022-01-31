package methodOverloading;

public class Mobile {
void camera()
{
	System.out.println("No camera");
}
}
class Nokia extends Mobile
{
	void camera()
	{
		System.out.println("1 camera");
	}
}
class Iphone extends Mobile
{
	void camera() {
		System.out.println("3 camera");
	}
}
