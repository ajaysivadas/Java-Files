package Array;

import java.util.Scanner;

public class New3 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter  the size");
	int size=s.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the value:");
	for(int i=0; i<a.length; i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("the Elements are:");
	for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]);
	}
}
}
