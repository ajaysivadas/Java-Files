package Encapsulation;

public class AA {
int Eid;
AA(int Eid)
{
	this.Eid=Eid;
	
}
public String toString()
{
	return "Eid:"+Eid;
}
public static void main(String[] args) {
	AA a1=new AA(2);
	System.out.println(a1);
}
}