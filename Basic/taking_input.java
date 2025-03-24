import java.util.Scanner;    // importing a java scanner(input) library //
public class taking_input {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);   // java scanner class declaration. //
        // taking input of integer num. //
        System.out.print("Enter a number :");
        int num1=sc.nextInt();
        System.out.println("The entered number is: "+num1);
        // taking input of a string. //
        System.out.print("Enter your name: ");
        String name=sc.next();
        System.out.println("Your name is: "+name);
        // taking input of a float value //
        System.out.print("Enter your 12th percentage: ");
        float P= sc.nextFloat();
        System.out.print("Your 12th percentage is: "+P);
    }
}
