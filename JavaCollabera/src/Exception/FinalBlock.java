package Exception;

public class FinalBlock {
public static void main(String[] args) {
	int i,j,k=0;
	i=6;
	j=0;
	try {
		k=i/j;
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("this is not block"+e);
	}
	catch(Exception p)
	{
		System.out.println("this is not exception block"+p);
	}
	finally
	{
		System.out.println("This is airhmetic Exception");
	}
}
}
