package practise;

abstract class Demo2 {
abstract void disp();
abstract void fo();
}
class Sample2 extends Demo2
{
	void disp()
	{
		System.out.println("Hello");
	}
	void fo()
	{
		System.out.println("good day");
	}
}
