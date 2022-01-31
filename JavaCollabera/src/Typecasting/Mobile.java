package Typecasting;

public class Mobile {
String mob_brand;
String mob_color;
int mob_cost;
Mobile(String mob_brand,String mob_color,int mob_cost)
{
	this.mob_brand=mob_brand;
	this.mob_color=mob_color;
	this.mob_cost=mob_cost;
	return;
}
public static void main(String[] args) {
	Mobile m=new Mobile("MI10I","Blue",24000);
	System.out.println(m.mob_brand);
	System.out.println(m.mob_color);
	System.out.println(m.mob_cost);
}
}
