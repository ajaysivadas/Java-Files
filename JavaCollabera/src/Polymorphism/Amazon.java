package Polymorphism;

public class Amazon {
void buy()
{
	System.out.println("online shopping");
}
}
class Cloths extends Amazon
{
	void buy()
	{
		System.out.println("buy cloths");
	}
}
class Shoe extends Amazon
{
	void buy()
	{
		System.out.println("buy shoe");
	}
}
class Mobile extends Amazon
{
	void buy()
	{
		System.out.println("buy Mobile");
	}
}
