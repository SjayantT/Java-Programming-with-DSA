package Array_2D;
import java.util.Scanner;
public class max_sum_row {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows of matrix: ");
        int m=sc.nextInt();
        System.out.print("Enter the number of colums of matrix: ");
        int n= sc.nextInt();
        int arr[][]= new int[m][n];
        // taking input of the array
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum;
        int max_sum=0; 
        int idx=-1;
        for(int i=0; i<=m-1; i++){
            sum=0;
            for(int j=0; j<=n-1; j++){
                sum=+arr[i][j];
                if(max_sum<sum){
                    max_sum=sum;
                    idx=i;
                }
            }
        }
        System.out.println("The row which has maximum sum of elements is: "+idx+" and the sum is: "+max_sum);
    }
}
