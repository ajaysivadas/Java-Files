package Program;

public class Prime1{
public static void main(String[] args) {
	System.out.println("Prime number between 1 to 100: ");
	{
	for(int k=2; k<=100; k++)
	{
	int no=k;
	boolean flag=true;
	for(int i=2; i<no; i++)
	{
		if(no%i==0)
		{
			flag=false;
			break;
		}
	}
	
		if(flag==true)
		{
			
	
			System.out.println(no);
		
		
	}	
}
}
}
}