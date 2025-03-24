package Array_2D;
import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter the number of colums: ");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        // taking input of the array 
        System.out.println("Enter the "+ r*c +" elements in array: ");
        for(int i=0; i<=r-1; i++){
            for(int j=0; j<=c-1; j++){
                arr[i][j]=sc.nextInt();
            }
        } 
        // printing the array 
        System.out.println("The array is: ");
        for(int i=0; i<=r-1; i++){
            for(int j=0; j<=c-1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
