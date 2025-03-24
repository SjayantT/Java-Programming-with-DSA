package Array;
import java.util.Scanner;
public class prefix_using_other_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        // taking input of array 
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        // calculating prefix using another array 
        int prefix[]= new int[n];
        prefix[0]=arr[0];
        for(int i=1; i<=n-1; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        // printing the prefix array
        System.out.println("The prefix sum array is: ");
        for(int i=0; i<=n-1; i++){
            System.out.print(prefix[i]+" ");
        }
    }
}
