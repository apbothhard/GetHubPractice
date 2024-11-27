package sample;

public class demo12
{
public static void main(String[] args) 
{
int num1=10;
int num2=20;
System.out.println("before swap: ");
System.out.println("number1: " +num1);
System.out.println("number2: "+num2);
num1=num1+num2; //10=10+20
num2=num1-num2;//20=10+20
num1=num1-num2;//10=10-20
System.out.println("After swap: ");
System.out.println("number1: "+num1);
System.out.println("number2: "+num2);
}
}
