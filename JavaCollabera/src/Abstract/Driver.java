package Abstract;

public class Driver {
public static void main(String[] args) {
	Cloths c1=new Cloths();
	Shoe s1=new Shoe();
	Amazmain a1=new Amazmain();
	a1.choose(s1);
	a1.choose(c1);
	Amazon a2=s1;
	a1.choose(a2);
	Amazon a3=c1;
	a1.choose(a3);
}
}
