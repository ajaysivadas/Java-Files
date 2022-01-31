package Array;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
	int sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size:");
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
