package Recursion;
import java.util.Scanner;
public class print_nTo1_numbers {
    static void print_nums(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        print_nums(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        print_nums(n);
    }
}
