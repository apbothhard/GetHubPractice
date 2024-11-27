package sample;

public class demo12
{
public static void main(String[] args) 
{
int num1=10;
int num=20;
System.out.println("before swap: ");
System.out.println("number1: " +num1);
System.out.println("number: "+num);
num1=num1+num; //10=10+20
num=num1-num;//20=10+20
num1=num1-num;//10=10-20
System.out.println("After swap: ");
System.out.println("number1: "+num1);
System.out.println("number: "+num);
}
}
