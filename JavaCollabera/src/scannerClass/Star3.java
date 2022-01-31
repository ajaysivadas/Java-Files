package scannerClass;

import java.util.Scanner;

public class Star3 {
	public static int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 2 no:");
	int a=s.nextInt();
	int b=s.nextInt();
	int sum=sum(a,b);
	System.out.println("Sum:" +sum);	
}
}
