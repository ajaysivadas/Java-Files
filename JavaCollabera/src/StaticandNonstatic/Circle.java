package StaticandNonstatic;
class Circle1
{
	void area() {
		int r=5;
		double pi=3.142;
		double res=pi*r*r;
		System.out.println("area of circle is: "+res);			
	}
}
public class Circle {
	public static void main(String[] args) {
		new Circle1().area();
	}

}
