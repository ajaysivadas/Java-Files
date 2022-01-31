package methodOverloading;

public class Zomato {
void order(int cost)
{
	System.out.println("Cost of ice: "+cost);
}
void order(String Food,int cost)
{
	System.out.println("Type of food: "+Food +" Cost of food :"+cost);
}
void order(String breakfast)
{
	System.out.println("Breakfast: "+breakfast);
}
public static void main(String[] args) {
	Zomato z1=new Zomato();
	z1.order(250);
	z1.order("Biriyani",540);
	z1.order("Dosa");
}
}