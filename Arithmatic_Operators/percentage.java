package Arithmatic_Operators;
import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first subject marks: ");
        float sub1= sc.nextFloat();
        System.out.print("Enter second subject number: ");
        float sub2= sc.nextFloat();
        System.out.print("Enter third subject marks: ");
        float sub3= sc.nextFloat();
        System.out.print("Enter fourth subject marks: ");
        float sub4= sc.nextFloat();
        System.out.print("Enter fifth number: ");
        float sub5= sc.nextFloat();
        float percentage= (sub1+sub2+sub3+sub4+sub5)*100/500;
        System.out.print("The percentage is: "+percentage);
    }
}
