package while_loops;
import java.util.Scanner;
public class Sum_of_even_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int ld=n%10;
            if(ld%2==0){
                sum+=ld;
            }
            n=n/10;
        }
        System.out.print("The sum of even digits of given number is: "+sum);
    }
}
