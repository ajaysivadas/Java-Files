package Exception;

public class Myassign1 {
public static void main(String[] args)  {
	int i=5,j=0;
	int k=0;
	try {
		k=i/j;
	}
	
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("This is block"+e);
	}
	catch(Exception d)
	{
		System.out.println("This not error"+d);
	}
}
}
