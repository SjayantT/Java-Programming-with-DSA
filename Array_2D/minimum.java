package Array_2D;
import java.util.Scanner;
public class minimum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows of the array: ");
        int m=sc.nextInt();
        System.out.print("Enter the number of colums of the array: ");
        int n=sc.nextInt();
        int arr[][]= new int[m][n];
        // taking input of the array 
        System.out.println("Enter the "+ m*n +" elements in the array: ");
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // calculation
        int min= Integer.MAX_VALUE;
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        System.out.print("The minimum element in the array is: "+min);
    }
}
