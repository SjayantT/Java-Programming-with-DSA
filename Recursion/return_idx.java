package Recursion;
import java.util.Scanner;
public class return_idx {
    static int search(int[] arr,int target,int idx){
        if(idx==arr.length) return -1;
        if(arr[idx]==target) return idx;
        return search(arr, target, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of the array
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a target: ");
        int target=sc.nextInt();
        System.out.println("found in index: "+search(arr, target, 0));
    }
}
