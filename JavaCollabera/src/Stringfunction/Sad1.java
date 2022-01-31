package Stringfunction;

public class Sad1 {
	public static void main(String[] args) {
		int count=0;
		String s1="Ajay";
		char c[]=s1.toCharArray();
		for(int i=0; i<c.length; i++)
		{
			if(c[i]=='a')
			{
				count++;		
				}
		}
		System.out.println(count);
	}
	
}
