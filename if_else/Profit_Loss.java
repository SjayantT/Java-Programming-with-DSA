package if_else;
import java.util.Scanner;
public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter cost price: ");
        float CP= sc.nextFloat();
        System.out.print("Enter selling price: ");
        float SP= sc.nextFloat();
        if(CP==SP){
            System.out.println("The seller has not made profit or loss.");
        }
        else if(SP>CP){
            System.out.println("The seller has made profit of "+(SP-CP));
        }
        else{
            System.out.println("The seller has smade loss of "+(CP-SP));
        }
    }
}
