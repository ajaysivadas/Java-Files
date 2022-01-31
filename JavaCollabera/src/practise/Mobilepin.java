package practise;
class Mobile
{
	private int lock=8050;
	public int getPin()
	{
		return lock;
	}
	public void setPin(int Pin)
	{
		this.lock=Pin;
	}
}
public class Mobilepin {
public static void main(String[] args) {
	Mobile m=new Mobile();
	System.out.println(m.getPin());
	m.setPin(1234);
}
}
