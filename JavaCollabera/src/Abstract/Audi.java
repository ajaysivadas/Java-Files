package Abstract;

public interface Audi {
void wheel();
void engine();
void brake();
}
class Audi_4 implements Audi
{
	public void wheel()
	{
		System.out.println("Alloy wheel");
	}
	public void engine()
	{
		System.out.println("V8 engine");
	}
	public void brake()
	{
		System.out.println("Brake");
	}
}

