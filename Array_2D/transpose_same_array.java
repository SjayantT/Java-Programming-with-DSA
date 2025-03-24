package Array_2D;
import java.util.Scanner;
public class transpose_same_array {
    static void transpose(int[][] arr, int m, int n){
        for(int i=0; i<=m-1; i++){
            for(int j=i+1; j<=n-1; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void print_array(int[][] arr,int m, int n){
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int n=sc.nextInt();
        System.out.print("Enter the number of colums of the matrix: ");
        int m=sc.nextInt();
        int arr[][]=new int[m][n];
        // taking input of the matrix elements
        System.out.println("Enter the elements of the matrix according to dimention: ");
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        transpose(arr, m, n);
        System.out.println("The array after transpose: ");
        print_array(arr, m, n);
    }
}
