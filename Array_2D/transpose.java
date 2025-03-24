package Array_2D;
import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows of matrix: ");
        int m=sc.nextInt();
        System.out.print("Enter the number of colums of matrix: ");
        int n=sc.nextInt();
        int arr[][]= new int[m][n];
        // taking input of the elements of matrix
        System.out.println("Enter the elements in the matrix: ");
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // transposing the matrix
        int brr[][]= new int[n][m];
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                brr[i][j]=arr[j][i];
            }
        }
        //printing the transpose answer
        System.out.println("The transpose matrix is: ");
        for(int i=0; i<=n-1; i++){
            for(int j=0; j<=m-1; j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
