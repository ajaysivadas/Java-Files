package Polymorphism;

public class Driver12 {
public static void main(String[] args) {
	Ola o=new Ola();
	Uber u=new Uber();
	Rapido r=new Rapido();
	Travel t1=new Travel();
	t1.journey(o);
	t1.journey(u);
	t1.journey(r);
}
}
