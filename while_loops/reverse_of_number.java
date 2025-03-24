package while_loops;
import java.util.Scanner;
public class reverse_of_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int reverse=0;
        while(n>0){
            int ld=n%10;
            reverse=(reverse*10)+ld;
            n=n/10;
        }
        System.out.print("The reverse of given number is: "+reverse);
    }
}
