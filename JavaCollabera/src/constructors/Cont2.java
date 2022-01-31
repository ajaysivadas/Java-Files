package constructors;

public class Cont2 {
Cont2(String s)
{
	System.out.println("My name:" +s);
}
Cont2(int age)
{
	System.out.println("My age: "+age);
}
Cont2(char a, double w)
{
	System.out.println("My  start letter:"+a+ " my weight:"+w);
}
public static void main(String[] args) {
	Cont2 a=new Cont2("Ajay");
	Cont2 b=new Cont2(23);
	Cont2 c=new Cont2('A',86);
}

}
