package thisKeywordImplementation;

import java.util.Scanner;

public class As2 {
public static void main(String[] args) {
	int sum=0;
	Scanner s=new Scanner(System.in);
	int a[]=new int[4];
	System.out.println("Enter the elements:");
	for(int i=0; i<a.length; i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0; i<a.length; i++)
	{
		sum=sum+a[i];
	}
	System.out.println("sum:"+sum);
}
}
