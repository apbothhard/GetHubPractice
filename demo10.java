package sample;

public class demo10 
{
public static void main(String[] args) {
	String s1="kiranbothhard";
	String s2=" ";
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2=s2+s1.charAt(i);
	}
	System.out.println("s1 string" +s1);
	System.out.println("s2 string" +s2);
}
}
