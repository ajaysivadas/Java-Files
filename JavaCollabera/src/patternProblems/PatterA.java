package patternProblems;

public class PatterA {
	public static void main(String[] args) {
		char ch='A';
		for(int i=4; i>=1; i--)	
		{
			for(int j=i; j<=4; j++)
			{
				System.out.print(ch+"  ");
				ch++;
			}
			System.out.println();
		}
		}

}
