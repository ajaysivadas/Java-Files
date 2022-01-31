package Inheritence;

public class Multi {
int x=20;
}
class Multi1 extends Multi
{
	int y=20;
}
class Multi2 extends Multi1
{
	void disp()
	{
		System.out.println("Good Day");
	}
}

