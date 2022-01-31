package Stringfunction;

public class Str {
public static void main(String[] args) {
	String s1="Ajay";
	String s2="Ajay";
	System.out.println(s1.length());
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	String s3="10";
String  a=String.valueOf(s3);
System.out.println(a);
String s4="Idli";
char c[]=s4.toCharArray();
for(int i=0;i<c.length;i++)
{
	System.out.println(c[i]);
}
String s5="      i am ajay      ";
System.out.println(s5.trim());
char d[]=s1.toCharArray();
int count=0;
for(int j=0; j<d.length; j++)
{
	if(d[j]=='a')
	{
	count++;	
	}
}
System.out.println("No of a:"+count);
System.out.println(s1.indexOf('d'));
System.out.println(s1.indexOf('a',2));
System.out.println(s1.indexOf('p'));
String s6="sumanth";
System.out.println(s6.substring(0,4));
System.out.println(s6.substring(4));
System.out.println(s6.substring(0,7));
System.out.println(s1.charAt(5));
String s7="Ram";
System.out.println(s1.concat(s7));
String s8="how are you";
String s9[]=s8.split(" ");
String ss9=" ";
for(int i=0; i<s9.length;i++)
{
	ss9=s9[i]+" "+ss9;
}
System.out.println(ss9);
String b="Ajay";
System.out.println(b.toLowerCase());
String b1="virat";
System.out.println(b1.toUpperCase());
String b2="Harry";
System.out.println(b2.replace('r', 'p'));
System.out.println(b2.startsWith("Har"));
System.out.println(b2.endsWith("ry"));
System.out.println(b2.lastIndexOf('r'));
String b3="Happy";
System.out.println(b2.compareTo(b3));
String b4="BIkE";
String b5="biKe";
System.out.println(b.compareTo(b4));

}
}

