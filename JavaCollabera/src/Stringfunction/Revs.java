package Stringfunction;

public class Revs {
public static void main(String[] args) {
	String s="Ajay";
	String s1="  ";
	char ch;
	for(int i=0; i<s.length();i++)
	{
		s1=s.charAt(i)+s1;
		
	}
	System.out.println(s1);
}
}
