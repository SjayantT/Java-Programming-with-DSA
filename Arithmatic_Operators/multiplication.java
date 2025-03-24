package Arithmatic_Operators;
import java.util.Scanner;
public class multiplication {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1= sc.nextInt();
        System.out.print("Enter second number: ");
        int num2= sc.nextInt();
        int multiply=num1*num2;
        System.out.print("The multiplication of two number is: "+multiply);
    }
}
