package Blocks;

public class B4 {
int a=10;
{
	int a=20;
	System.out.println(a);
}
{
	int a=30;
	System.out.println(this.a);
}
public static void main(String[] args) {
	B4 b=new B4();
}
}
