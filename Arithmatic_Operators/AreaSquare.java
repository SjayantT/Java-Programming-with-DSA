package Arithmatic_Operators;
import java.util.Scanner;
public class AreaSquare {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the side of area: ");
        int side= sc.nextInt();
        int area= side*side;
        System.out.print("The area of square is: "+area);
    }
}
