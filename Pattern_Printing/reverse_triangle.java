package Pattern_Printing;
import java.util.Scanner;
public class reverse_triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of lines of a triangle: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
