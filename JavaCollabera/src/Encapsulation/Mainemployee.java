package Encapsulation;

public class Mainemployee {
public static void main(String[] args) {
	Employee e1=new Employee("Ajay",1,30000,"TE");
	e1.setSal(35000);
	displayDetails(e1);

}
	public static void displayDetails(Employee e)
	{
		System.out.println(e.getname());
		System.out.println(e.getDes());
		System.out.println(e.getSal());
		System.out.println(e.getEid());
	}
}

