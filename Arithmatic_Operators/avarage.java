package Arithmatic_Operators;
import java.util.Scanner;
public class avarage {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= sc.nextInt();
        System.out.print("Enter second number: ");
        int b= sc.nextInt();
        System.out.print("Enter third number: ");
        int c= sc.nextInt();
        System.out.print("Enter fourth number: ");
        int d= sc.nextInt();
        float avg= (a+b+c+d)/4;
        System.out.print("The average of two number is: "+avg);
    }
}
