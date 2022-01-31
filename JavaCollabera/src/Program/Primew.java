package Program;

public class Primew{
public static void main(String[] args) {
	int no=6;
boolean flag=true;
int i=2;
while(i<no)
{
	if(no%i==0)
	{
		flag=false;
		
	}

	i++;
}
	if(flag==true)
	{
		System.out.println(no+ " is prime no");
	}
	else
	{
		System.out.println(no+" not prime no");
	}
}
}

