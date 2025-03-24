package Recursion;
import java.util.Scanner;
public class sum_of_n_numbers {
    static int sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a term: ");
        int n=sc.nextInt();
        System.out.print("The sum of first "+n+ " natural number is: "+sum(n));
    }
}
