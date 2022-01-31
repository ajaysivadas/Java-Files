package Exception;

import java.util.Scanner;

public class CustomException {
public static void main(String[] args) throws UnderAgeException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age:");
	int age=sc.nextInt();
	try {
		if(age<=21)
		{
			throw new UnderAgeException("under age exception:age is under age");
			
		}
		else
		{
			System.out.println("Show profile");
		}
	}
	catch(UnderAgeException u)
	{
		System.out.println("Exception occured but its handled"+u.getMessage());
	}
}
}
class UnderAgeException extends Exception	
{
	String message;
	UnderAgeException(String message)
	{
		this.message=message;
	}
	public String getMessage(){
		return message;
	}
}


