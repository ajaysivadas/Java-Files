package Typecasting;

public class Bike {
String bike_name;
String bike_color;
int bike_cost;
Bike(String bike_name,String bike_color,int bike_cost)
{
	this.bike_color=bike_color;
	this.bike_cost=bike_cost;
	this.bike_name=bike_name;
	
}
public static void main(String[] args) {
	Bike b=new Bike("Duke","Orange",120000);
	System.out.println(b.bike_cost);
	System.out.println(b.bike_color);
	System.out.println(b.bike_name); 
}
}
