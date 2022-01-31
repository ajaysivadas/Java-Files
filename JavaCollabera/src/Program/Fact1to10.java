package Program;

public class Fact1to10 {
public static void main(String[] args) {
	System.out.println("factorial between 1 to 10: ");
	int fact=1;
int i=1;
while(i<=10)
{
	fact=fact*i;
	System.out.println(i+" factorail:  "+fact);
	i++;
}
}
}