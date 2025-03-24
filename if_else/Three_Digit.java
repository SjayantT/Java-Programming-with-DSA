package if_else;
import java.util.Scanner;
public class Three_Digit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num= sc.nextInt();
        if(num>99 && num<1000){
            System.out.println("The given number is a three digit number.");
        }
        else{
            System.out.println("The given number is not a three digit number: ");
        }
    }
}
