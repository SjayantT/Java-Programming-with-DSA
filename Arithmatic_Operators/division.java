package Arithmatic_Operators;
import java.util.Scanner;
public class division {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1= sc.nextInt();
        System.out.print("Enter second number: ");
        int num2= sc.nextInt();
        int division= num1/num2;
        System.out.println("The division of two matrix is: "+division);
    }
    
}
