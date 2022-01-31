package methodOverloading;

public class Mobilemain {
public static void main(String[] args) {
	Mobile  m1=new Mobile();
	m1.camera();
	Nokia m2=new Nokia();
	m2.camera();
	Mobile m3=new Iphone();
	m3.camera();
}
}
