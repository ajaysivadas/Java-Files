package methodOverloading;

public class Carf {
void Light()
{
	System.out.println("halogin light");
}
}
class Cars extends Carf
{
	void Light()
	{
		System.out.println("LED light");
	}
}