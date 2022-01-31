package Array;

import java.util.Scanner;

public class New5 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int sum=0;
	System.out.println("Enter the size");
	int size=s.nextInt();
	int a[]=new int[size];
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
