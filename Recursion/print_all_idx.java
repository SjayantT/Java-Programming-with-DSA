package Recursion;
import java.util.Scanner;
public class print_all_idx {
    static void printIdx(int[] arr, int target, int idx){
        if(idx==arr.length) return;
        if(arr[idx]==target) System.out.print(idx+" ");
        printIdx(arr, target, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        //taking input of the array 
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a target: ");
        int target=sc.nextInt();
        System.out.println("The indeces where "+target+ " found: ");
        printIdx(arr, target, 0);
    }
}
