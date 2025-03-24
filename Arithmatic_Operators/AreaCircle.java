package Arithmatic_Operators;
import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
    System.out.print("Enter radius:");
    float r=sc.nextFloat();
    float pie=3.1415f;
    float area= pie*r*r;
    System.out.print("The area of circle is: "+area);
    }
}
