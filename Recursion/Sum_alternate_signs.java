package Recursion;
import java.util.Scanner;
public class Sum_alternate_signs {
    static int sum(int n){
        if(n==1) return 1;
        if(n%2==0) return sum(n-1)-n;
        else return sum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        System.out.print("The sum of all the natural nubers upto "+n+" with alternate signs is: "+sum(n));
    }
}
