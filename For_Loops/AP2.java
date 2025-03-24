package For_Loops;
import java.util.Scanner;
public class AP2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter series term: ");
        int n=sc.nextInt();
        int a=7;
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            a=a+3;
        }
    }
}
