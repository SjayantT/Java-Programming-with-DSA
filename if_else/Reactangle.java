package if_else;
import java.util.Scanner;
public class Reactangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the width of retangle: ");
        float a= sc.nextFloat();
        System.out.print("Enter the breadth of rectangle: ");
        float b= sc.nextFloat();
        float area= a*b;
        float perimeter= 2*(a+b);
        if(area>perimeter){
            System.out.print("The area is greater than perimeter of rectangle.");
        }
        else{
            System.out.print("The perimeter of rectangle is greater than area.");
        }
    }
}
