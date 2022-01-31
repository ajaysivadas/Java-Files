package Typecasting;

public class Dress {
String Dress_color;
String Dress_Size;
int Dress_cost;
Dress(String Dress_color,String Dress_Size,int Dress_cost)
{
this.Dress_color=Dress_color;
this.Dress_Size=Dress_Size;
this.Dress_cost=Dress_cost;
}
public static void main(String[] args) {
	Dress d=new Dress("Blue","xl",8);
	System.out.println(d.Dress_color);
	System.out.println(d.Dress_cost);
	System.out.println(d.Dress_Size);
}
}
