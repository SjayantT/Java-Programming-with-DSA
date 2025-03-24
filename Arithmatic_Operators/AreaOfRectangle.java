package Arithmatic_Operators;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int length=sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth=sc.nextInt();
        int Area=length*breadth;
        System.out.print("The area of rectangle is: "+Area);
    }
}
