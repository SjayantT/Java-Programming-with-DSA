package Recursion;
import java.util.Scanner;
public class HCF {
    static int hcf(int x, int y){
        if(y==0) return x;
        return hcf(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any two numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.print("HCF of "+x+" and "+y+" is: "+hcf(x, y));
    }
}
