package Typecasting;

public class Car {
String Car_brand;
String Car_color;
String Car_type;
Car(String Car_brand,String Car_color,String Car_type)
{
	this.Car_brand=Car_brand;
	this.Car_color=Car_color;
	this.Car_type=Car_type;
	return;
}
public static void main(String[] args) {
	Car c=new Car("swift","white","Petrol");
	System.out.println(c.Car_brand);
	System.out.println(c.Car_color);
	System.out.println(c.Car_type);
}
}
