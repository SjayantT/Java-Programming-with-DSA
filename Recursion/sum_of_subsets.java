package Recursion;
import java.util.Scanner;
public class sum_of_subsets {
    static void printSum(int[] arr, int idx, int sum){
        if(idx==arr.length){
            System.out.print(sum+", ");
            return;
        }
        int current=arr[idx];
        printSum(arr, idx+1, sum+current);
        printSum(arr, idx+1, sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of the array
        System.out.println("Enter elements in the array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("The sum of all the possible subsets are: ");
        printSum(arr, 0, 0);
    }
}
