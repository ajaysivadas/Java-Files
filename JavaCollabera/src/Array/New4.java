package Array;

import java.util.Scanner;

public class New4 {
	
static int sum(int a[])
{
	int sum=0;
for(int i=0; i<a.length; i++)
{
	sum=sum+a[i];
}
return sum;
}
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
int a[]=new int[5];
for(int i=0; i<a.length; i++)
{
	a[i]=s.nextInt();
}
int add=sum(a);
System.out.println("sum:"+add);
}
}

