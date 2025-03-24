package Arithmatic_Operators;
import java.util.Scanner;
public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter side of square: ");
        int side=sc.nextInt();
        int Perimeter=4*side;
        System.out.print("The perimeter of square is: "+Perimeter);
    }
}
