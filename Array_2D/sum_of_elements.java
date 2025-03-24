package Array_2D;
import java.util.Scanner;
public class sum_of_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows of the 2D array: ");
        int m=sc.nextInt();
        System.out.print("Enter the number of colums of the 2D array: ");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        // taking input of the array
        System.out.println("Enter " + m*n + " elements in the array: ");
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // calculation
        int sum=0;
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.print("The sum of all the elements of array is: "+sum);
    }
}
