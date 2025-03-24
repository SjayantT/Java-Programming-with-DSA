package Arithmatic_Operators;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter principal price: ");
        float p=sc.nextFloat();
        System.out.print("Enter rate: ");
        float r=sc.nextFloat();
        System.out.print("Enter time period in years: ");
        float t= sc.nextFloat();
        float SI= p*r*t/100;
        System.out.print("The total simple interest is: "+SI);
    }
}
