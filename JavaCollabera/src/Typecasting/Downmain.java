package Typecasting;

public class Downmain {
public static void main(String[] args) {
Down1 d1=new Down2();
System.out.println(d1.i);
Down2 d2=(Down2)d1;
System.out.println(d2.j);
System.out.println(d2.i);
Down1 d4=new Down3();
Down3 d5=(Down3)d4;
System.out.println(d5.i);
System.out.println(d5.j);
System.out.println(d5.k);
}
}
