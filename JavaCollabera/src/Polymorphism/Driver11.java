package Polymorphism;

public class Driver11 {
public static void main(String[] args) {
	Cloths c1=new Cloths();
	Shoe s1=new Shoe();
	Mobile m1=new Mobile();
	Ekart e1=new Ekart();
	e1.choose(c1);
	e1.choose(s1);
	e1.choose(m1);
}
}
