package StaticandNonstatic;

public class Rectangle {
static void area() {
	int w=3,h=5;
	int result=w*h;
	System.out.println(result);
}
public static void main(String[] args) {
	System.out.println("area of rectangle is: ");
	new Rectangle().area();
}
}

