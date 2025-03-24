package Recursion;
import java.util.Scanner;
public class printing_array {
    static void printArray(int[] arr, int idx){
        if(idx==arr.length-1){
            System.out.print(arr[idx]+" ");
            return;
        }
        System.out.print(arr[idx]+" ");
        printArray(arr, idx+1);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        //taking input of the elements in the array
        System.out.println("Enter the elements in the array : ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is : ");
        printArray(arr, 0);
    }
}
