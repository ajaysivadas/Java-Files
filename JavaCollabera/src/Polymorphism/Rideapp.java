package Polymorphism;

public class Rideapp {
void ride()
{
	System.out.println("book ride");
}
}
class Ola extends Rideapp
{
	void ride()
	{
		System.out.println("Book ride using OLA");
	}
}
class Uber extends Rideapp
{
	void ride()
	{
		System.out.println("Book ride using Uber");
	}
}
class Rapido extends Rideapp
{
	void ride()
	{
		System.out.println("Book ride using Rapido");
	}
}
