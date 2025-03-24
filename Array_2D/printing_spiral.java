package Array_2D;
import java.util.Scanner;
public class printing_spiral {
    static void print_spiral(int [][] arr, int m, int n){
        int top_row=0, bottom_row=m-1, left_colum=0, right_colum=n-1;
        int total_elements=0;
        while(total_elements<m*n){
            for(int j=left_colum; j<=right_colum && total_elements<m*n; j++){
                System.out.print(arr[top_row][j]+" ");
            }
            top_row++;
            for(int i=top_row; i<=bottom_row && total_elements<m*n; i++){
                System.out.print(arr[i][right_colum]+" ");
            }
            right_colum--;
            for(int j=right_colum; j>=left_colum && total_elements<m*n; j--){
                System.out.print(arr[bottom_row][j]+" ");
            }
            bottom_row--;
            for(int i=bottom_row; i>=top_row && total_elements<m*n; i--){
                System.out.print(arr[i][left_colum]+" ");
            }
            left_colum++;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int m=sc.nextInt();
        System.out.print("Enter the number of colums of the matrix: ");
        int n=sc.nextInt();
        int arr[][]= new int[m][n];
        // taking input of the matrix
        System.out.println("Enter the all the elements of the matrix: ");
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        print_spiral(arr, m, n);
    }
}
