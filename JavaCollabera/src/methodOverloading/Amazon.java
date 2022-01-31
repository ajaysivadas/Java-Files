package methodOverloading;

public class Amazon {
void Online(String type)
{
	System.out.println("type of product: "+type);
}
void Online(String Shoe,int cost)
{
	System.out.println("type of Shoe: "+Shoe+"  Cost:"+ cost);
}
public static void main(String[] args) {
	Amazon a=new Amazon();
	a.Online("Lifestyle");
	a.Online("PUMA",2500);
}
}