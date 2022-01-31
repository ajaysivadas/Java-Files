package Condition;
class Ref
{
	static void area() {
		int a=5;
		int res=a*a;
		System.out.println("res:"+ res);
	}
}
public class Reference1 {
public static void main(String[] args) {
	Ref r1=new Ref();
	r1.area();
}
}
