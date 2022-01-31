package Pattern;

public class DD {
DD(int a)
{
	this();
	System.out.println("hello");
}
DD()
{
	System.out.println("hii");
}
}
class CC extends DD{
CC()
{
	this(10);
	System.out.println("hellooo");
}
CC(double x)
{
	System.out.println("good ");
}
}
