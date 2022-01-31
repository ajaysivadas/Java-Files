package practise;
class Lap
{
	private String pass="smile";
	public String getPass()
	{
		return pass;
	}
	public void setPass(String PASS)
	{
		this.pass=PASS;
	}
	
}
public class Laptop {
	public static void main(String[] args) {
		Lap l1=new Lap();
		System.out.println(l1.getPass());
	}

}
