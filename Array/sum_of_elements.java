package Array;
import java.util.Scanner;
public class sum_of_elements {
    static void sum(int[] arr,int n){
        int sum=0;
        for(int i=0; i<=n-1; i++){
            sum=sum+arr[i];
        }
        System.out.print("The sum of array elements is: "+ sum);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // input
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        sum(arr,n);
    }
}
