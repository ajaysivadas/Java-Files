package practise;

abstract class Sample {
abstract void disp();
abstract void test();
}
class Demo1 extends Sample
{
	void disp()
	{
		System.out.println("hii");
	}
	void test()
	{
		System.out.println("Helllooo");
	}
}
