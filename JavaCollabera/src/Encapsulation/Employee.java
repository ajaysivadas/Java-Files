package Encapsulation;

public class Employee {
private String name;
private int eid;
private double sal;
private String des;
Employee(String name,int eid,double sal,String des)
{
	this.name=name;
	this.eid=eid;
	this.sal=sal;
	this.des=des;
}
public String getname() {
	return name;
}
public void setname(String name)
{
	this.name=name;
}
public int getEid() {
	return eid;
}
public void setEid(int eid)
{
	this.eid=eid;
}
public double getSal() {
	return sal;
}
public void setSal(double sal)
{
	if(sal>this.sal)
	{
	this.sal=sal;

	System.out.println("salary got update");
	}
}
public String getDes() {
	return des;
}
public void setDes(String des)
{
	this.des=des;
}
}
