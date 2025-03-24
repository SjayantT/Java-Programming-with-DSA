package if_else;
import java.util.Scanner;
public class divisible_by3or5Not15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if((num%3==0 || num%5==0)&& num%15!=0){
            System.out.println("The given number is divisible by 3 or 5 but not 15.");
        }
        else{
            System.out.print("The condition did not match.");
        }
    }
}
