
public class Prime {
	public static void main(String[] args) {
		int num= 3;
		boolean flag = true;
		for (int i = 2; i<num; i++) {
			if (num % 2 == 0) {
				flag = false;
				break;
			}
		}
			if (flag == true) {
				System.out.println(num+" is prime no ");
			} else {
				System.out.println(num+"It is not prime no");
			}
		}
	
}