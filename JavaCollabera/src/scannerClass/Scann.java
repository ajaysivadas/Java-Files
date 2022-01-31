package scannerClass;

import java.util.Scanner;

public class Scann{
	static  int sub(int a,int b)
	{
		int d=a-b;
return d;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sub=sub(a,b);
		System.out.println("Sub:" +sub);
	}
}
