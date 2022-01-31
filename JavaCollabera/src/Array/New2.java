package Array;

import java.util.Scanner;

public class New2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size");
	int size=s.nextInt();
	int sum=0;
	int a[]=new int[size];
	System.out.println("Enter the value");
	for(int i=0; i<a.length; i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0; i<a.length; i++)
 sum=sum+a[i];
	System.out.println("sum:"+sum);
	
}
}
