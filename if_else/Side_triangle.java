package if_else;
import java.util.Scanner;
public class Side_triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int a=sc.nextInt();
        System.out.print("Enter the second side: ");
        int b=sc.nextInt();
        System.out.print("Enter the third side:");
        int c= sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("The given sides can be the sudes if triangle.");
        }
        else{
            System.out.println("The given side are not the side of triangle.");
        }
    }
}
