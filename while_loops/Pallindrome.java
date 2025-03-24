package while_loops;
import java.util.Scanner;
class Pallindrome{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int original=n;
        int reverse=0;
        while(n>0){
            int ld=n%10;
            reverse=(reverse*10)+ld;
            n=n/10;
        }
        if(original==reverse){
            System.out.print("The given number is pallindrome number.");
        }
        else{
            System.out.print("The given number is not pallindrome number.");
        }
    }
}
