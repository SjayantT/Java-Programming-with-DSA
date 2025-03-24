package Arithmatic_Operators;
import java.util.Scanner;
public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        int length=sc.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        int breadth=sc.nextInt();
        int Perimeter= 2*(length+breadth);
        System.out.print("The perimeter of rectangle is: "+Perimeter);
    }
}
