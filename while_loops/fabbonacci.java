package while_loops;
import java.util.Scanner;
public class fabbonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.print("Enter the number of terms of fabonacci series: ");
        int n=sc.nextInt();
        System.out.println("The fabonacci series upto "+n+" term: ");
        System.out.print(a+" "+b+" ");
        int i=1;
        while(i<=n-2){
            int sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum+" ");
            i++;
        }
    }
}
