package Pattern_Printing;
import java.util.Scanner;
public class AP_rectangle {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number of rows of a rectangle: ");
        int m=sc.nextInt();
        System.out.print("Enter the number of colums of a rectangle: ");
        int n=sc.nextInt();
        for(int i=1;i<=m;i++){
            int a=1;
            for(int j=1;j<=n;j++){
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }
    }
}

