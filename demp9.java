package sample;

public class demp9 
{
public static void main(String[] args)
{
	String s1="deed";
	String s2="";
	for(int i=s1.length()-1;i>=0;i--) 
	{
	s1=s1+s2.charAt(i);
	}
	System.out.println(s2);

if(s1.equals(s2)) 
{
System.out.println("given String is a palendrome");	
}
else {
	System.out.println("given String is not palindrome");
}
}
}
