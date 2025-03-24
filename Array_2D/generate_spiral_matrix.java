package Array_2D;
import java.util.Scanner;
public class generate_spiral_matrix {
    static int [][] spiral_matrix(int n){
        int top_row=0, bottom_row=n-1, left_colum=0, right_colum=n-1; 
        int arr[][]=new int[n][n];
        int current_val=1;
        while(current_val<=n*n){
            for(int j=left_colum; j<=right_colum && current_val<=n*n; j++){
                arr[top_row][j]=current_val;
                current_val++;
            }
            top_row++;
            for(int i=top_row; i<=bottom_row && current_val<=n*n; i++){
                arr[i][right_colum]=current_val;
                current_val++;
            }
            right_colum--;
            for(int j=right_colum; j>=left_colum && current_val<=n*n; j--){
                arr[bottom_row][j]=current_val;
                current_val++;
            }
            bottom_row--;
            for(int i=bottom_row; i>=top_row && current_val<=n*n; i--){
                arr[i][left_colum]=current_val;
                current_val++;
            }
            left_colum++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows and colums of the matrix: ");
        int n=sc.nextInt();
        int arr[][]=spiral_matrix(n);
        // printing array
        System.out.println("The spiral matrix is: ");
        for(int i=0; i<=n-1; i++){
            for(int j=0; j<=n-1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
