package Array_2D;
import java.util.Scanner;
public class rotate_90 {
    static void transpose(int [][] arr,int m, int n){
        for(int i=0; i<=m-1; i++){
            for(int j=i+1; j<=n-1; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void reverse_row(int [][] arr, int m, int n){
        for(int i=0; i<=m-1; i++){
            int j=0;
            int k=n-1; 
            while(j<k){
                int temp=arr[i][j];
                arr[i][j]=arr[i][k];
                arr[i][k]=temp;
                j++;
                k--;
            }
        }
    }
    static void printArray(int [][] arr, int m, int n){
        System.out.println("The array after the 90* rotation is: ");
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows of matrix: ");
        int m=sc.nextInt();
        System.out.print("Enter the number of colums of matrix: ");
        int n=sc.nextInt();
        int arr[][]= new int[m][n];
        // taking input of the matrix element
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        transpose(arr, m, n);
        reverse_row(arr, m, n);
        printArray(arr, m, n);
    }
}
