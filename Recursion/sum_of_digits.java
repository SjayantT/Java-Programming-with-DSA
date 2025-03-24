package Recursion;
import java.util.Scanner;
public class sum_of_digits {
    static int reverse(int n){
        if(n>0 && n<=10) return n;
        return reverse(n/10)+ n%10;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc.nextInt();
        System.out.print("The sum of all digits of the given number is: "+reverse(n));
    }
}
