package For_Loops;
import java.util.Scanner;
public class fabonacci {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.print("Enter the number of term of fabonacci series:");
        int n=sc.nextInt();
        System.out.println("The fabonacci series upto "+n+" term: ");
        System.out.print(a+" "+b+" ");
        for(int i=1; i<=n-2; i++){
            int sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum+" ");
        }
    }
}
