package Pattern_Printing;
import java.util.Scanner;
public class AP_Square {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows and culoum of a square: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=1;
            for(int j=1;j<=n;j++){
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }
    }
}
