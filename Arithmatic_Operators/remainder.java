package Arithmatic_Operators;
import java.util.Scanner;
public class remainder {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter first number: ");
       int num1=sc.nextInt();
       System.out.print("Enter second number: ");
       int num2=sc.nextInt();
       int remainder=num1%num2;
       System.out.print("The remainder is: "+remainder);  
    }
}
