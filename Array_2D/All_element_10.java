package Array_2D;
import java.util.Scanner;
public class All_element_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m=sc.nextInt();
        System.out.print("Enter the number of colums : ");
        int n=sc.nextInt();
        int arr[][]= new int[m][n];
        // taking input of the array 
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                arr[i][j]=10;
            }
        }
        // printng the given array
        System.out.println("The array is: ");
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
