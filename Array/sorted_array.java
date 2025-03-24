package Array;
import java.util.Scanner;
public class sorted_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of array
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        // checking for sorted array
        boolean ans=true;
        for(int i=1; i<=n-1; i++){
            if(arr[i-1]>arr[i]){
                ans=false;
            }
        }
        if(ans==true){
            System.out.println("The given array is sorted.");
        }
        else{
            System.out.println("The given array is not sorted.");
        }
    }
}

