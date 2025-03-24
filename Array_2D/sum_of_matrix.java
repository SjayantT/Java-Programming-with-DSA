package Array_2D;
import java.util.Scanner;
public class sum_of_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows of matrix 1: ");
        int m=sc.nextInt();
        System.out.print("Enter the number of colums of matrix 1: ");
        int n=sc.nextInt();
        int matrix_1[][] =new int[m][n];
        // taking elements of matrix 1
        System.out.println("Enter the elements of the matrix 1: ");
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                matrix_1[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the number of rows of matrix 2: ");
        int p=sc.nextInt();
        System.out.print("Enter the number of colums of matrix 2: ");
        int q=sc.nextInt();
        int matrix_2[][]= new int[p][q];
        // taking input of matrix 2
        System.out.println("Enter the elements of matrix 2: ");
        for(int i=0; i<=p-1; i++){
            for(int j=0; j<=q-1; j++){
                matrix_2[i][j]=sc.nextInt();
            }
        }
        int sum[][]=new int[m][n];
        if(m==p && n==q){
            for(int i=0; i<=m-1; i++){
                for(int j=0; j<=n-1; j++){
                    sum[i][j]=matrix_1[i][j]+matrix_2[i][j];
                }
            }
            // printing the result
            System.out.println("The addition of two matrices are: ");
            for(int i=0; i<=m-1; i++){
                for(int j=0; j<=n-1; j++){
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.print("The addition of matrices with these dimentions is not possible.");
        }
    }
}
