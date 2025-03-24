package Pattern_Printing;
import java.util.Scanner;
public class star_rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows of rectangle: ");
        int m=sc.nextInt();
        System.out.print("Enter the number of colums of rectangle: ");
        int n=sc.nextInt();
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
