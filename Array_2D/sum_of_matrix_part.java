package Array_2D;
import java.util.Scanner;
public class sum_of_matrix_part {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int m=sc.nextInt();
        System.out.print("Enter the number of colums of the matrix: ");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        // taking input of the matrix elements
        System.out.println("Enter " +m*n+ " elements in the matrix: ");
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter l1 and r1 : ");
        int L1=sc.nextInt();
        int R1=sc.nextInt();
        System.out.print("Enter the l2 and r2 : ");
        int L2=sc.nextInt();
        int R2=sc.nextInt();
        int sum=0; 
        for(int i=L1; i<=L2; i++){
            for(int j=R1; j<=R2; j++){
                sum+=arr[i][j];
            }
        }
        System.out.print("The sum between (" +L1+ ","+R1 +") and (" +L2+ "," +R2+ ") is: "+sum);
    }
}
