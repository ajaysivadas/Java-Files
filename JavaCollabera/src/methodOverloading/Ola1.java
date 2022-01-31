package methodOverloading;

public class Ola1 {
void Book(int a)
{
	System.out.println("No of seat "+ a);
}
void Book(int b,String c)
{
	System.out.println("No of seat:	az "+ b +" Type of vehicle: "+c);
}
public static void main(String[] args) {
	Ola1 s=new Ola1();
	s.Book(4);
	s.Book(3,"Auto");
}
}
