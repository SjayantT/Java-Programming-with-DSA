package while_loops;
import java.util.Scanner;
public class numberOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.print("The  number of digits in given number is: "+count);
    }
}
