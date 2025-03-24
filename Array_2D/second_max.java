package Array_2D;
import java.util.Scanner;
public class second_max {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m=sc.nextInt();
        System.out.print("Enter the number of colums: ");
        int n=sc.nextInt();
        int arr[][]= new int[m][n];
        // taking input of elements of the array
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // calculation
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                if(max<arr[i][j]){
                    max= arr[i][j];
                }
            }
        }
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                if(max!=arr[i][j] && second_max<arr[i][j]){
                    second_max=arr[i][j];
                }
            }
        }
        System.out.print("The second maximum element in array is: "+second_max);
    }
}