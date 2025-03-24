package Recursion;
import java.util.Scanner;
public class maximum_element_array {
    static int maximum_element(int [] arr, int idx){
        if(idx==arr.length-1) return arr[idx];
        int ans=maximum_element(arr, idx+1);
        return Math.max(arr[idx], ans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //taking input of the array
        System.out.println("Enter elements in the array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The maximum element in the array is: "+maximum_element(arr, 0));
    }
}
