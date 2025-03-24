package Array;
import java.util.Scanner;
public class prefix_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        //taking input of the array 
        System.out.println("Enter all th elemesnts of the array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        // calculating the prefix sum in the same array
        for(int i=1; i<=n-1; i++){
            arr[i]=arr[i]+arr[i-1];
        }
        // printing the array after calculating the prefix sum
        System.out.println("The prefix sum array is : ");
        for(int i=0; i<=n-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
