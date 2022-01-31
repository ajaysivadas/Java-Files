package StaticandNonstatic;

class Triangle1 {
void area()
{
	int b=3,h=5;
	double x=0.5;
	double res=x*b*h;
	System.out.println("area of triangle: "+res);
}
}
public class Triangle
{
	public static void main(String[] args) {
		
		new Triangle1().area();
	}
}
