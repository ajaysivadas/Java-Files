package constructors;

public class Const3 {
Const3(int a)
{
	System.out.println(a);
}
Const3(String a,double b)
{
System.out.println(a+ " "+ b);	
}
Const3(char c,int a)
{
	System.out.println(c+ " "+a);
}
public static void main(String[] args) {
	Const3 c=new Const3(34);
	Const3 d=new Const3("senno",4.6);
	Const3 e=new Const3('m',32);
}
}
