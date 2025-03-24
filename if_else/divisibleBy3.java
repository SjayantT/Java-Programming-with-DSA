package if_else;
import java.util.Scanner;
public class divisibleBy3 {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number= sc.nextInt();
    if(number%2==0){
        System.out.println("The number is divisible by 3.");
    }
    else{
        System.out.println("The number is not divisible by 3.");
    }
   } 
}
