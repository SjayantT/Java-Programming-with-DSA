package Array;
import java.util.Scanner;
public class second_max {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of array
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int second_max=arr[0];
        // checking for second maximum elements 
        for(int i=0; i<=n-1; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0; i<=n-1; i++){
            if(max!=arr[i]&&second_max<arr[i]){
                second_max=arr[i];
            }
        }
        System.out.print("The second max element in given array is: "+second_max);
    }
}
