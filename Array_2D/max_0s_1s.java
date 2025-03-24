package Array_2D;
import java.util.Scanner;
public class max_0s_1s {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows of matrix: ");
        int m=sc.nextInt();
        System.out.print("Enter the number of colums of the array: ");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        // taking input of the array
        System.out.println("Enter the 0s and 1s as elements in the array: ");
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int count=0; 
        int max_count=0;
        int idx=-1;
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n-1; j++){
                if(arr[i][j]==1){
                    count++;
                }
                if(max_count<count){
                    max_count=count;
                    idx=i;
                }
            }
        }
        System.out.println("The maximum number of 1s is in row: "+idx);
    }
}
