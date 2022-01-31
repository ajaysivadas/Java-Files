package Encapsulation;

public class Emp {
int eid;
Emp(int eid)
{
	this.eid=eid;
}

public String toString()
{
	return "Eid:"+eid;
}
public boolean equals(Object obj)
{
	return this.eid==((Emp)obj).eid;

}
public static void main(String[] args) {
	Emp e=new Emp(1);
	Emp e1=new Emp(1);
	System.out.println(e.equals(e1));
}
}
