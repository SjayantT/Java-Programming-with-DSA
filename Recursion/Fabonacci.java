package Recursion;
import java.util.Scanner;
public class Fabonacci {
    static int fab(int n){
        if(n==0 || n==1) return n;
        return fab(n-1)+fab(n-2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a the term of fabonacci series: ");
        int n=sc.nextInt();
        System.out.println("The "+n+"th fabonacci number is: "+fab(n));
    }
}
