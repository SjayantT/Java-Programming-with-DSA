package Recursion;
import java.util.Scanner;
public class k_multiuple_of_n {
    static void multiple(int n, int k){
        if(k==1){
            System.out.print(n+" ");
            return;
        }
        multiple(n, k-1);
        System.out.print(n*k+" ");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print("Enter multiple terms of "+n+ ": ");
        int k=sc.nextInt();
        multiple(n, k);
    }
}
