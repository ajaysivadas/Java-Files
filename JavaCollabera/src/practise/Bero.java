package practise;
class Berolock
{
	private int Bero_lock=6789;
	public int getLock()
	{
		return Bero_lock;
	}
	public void setLock(int Lock)
	{
		this.Bero_lock=Lock;
	}
}
public class Bero {
	public static void main(String[] args) {
		Berolock b1=new Berolock();
		System.out.println(b1.getLock());
	}

}
