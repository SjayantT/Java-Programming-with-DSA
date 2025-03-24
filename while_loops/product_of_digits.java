package while_loops;
import java.util.Scanner;
public class product_of_digits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int product=1;
        while(n>0){
            int ld= n%10;
            product=product*ld;
            n=n/10;
        }
        System.out.print("The product of digits of given number is: "+product);
    }
}
