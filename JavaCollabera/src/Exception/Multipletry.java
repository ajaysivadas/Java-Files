
package Exception;

public class Multipletry {
public static void main(String[] args) {
	try {
		int k=1/0;
	}
	
	catch(ArrayIndexOutOfBoundsException a)
	{
	System.out.println("i m block"+a);	
	}
	catch(Exception P)
	{
	System.out.println("I am Exception");
	}
	
}
}
