package Recursion;
import java.util.Scanner;
public class sum_elements_of_arr {
    static int sumElements(int[] arr, int idx){
        if(idx==arr.length-1) return arr[idx];
        return arr[idx]+sumElements(arr, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the ssize of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // taking input of the array
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The sum of the elements of the array is: "+sumElements(arr, 0));
    }
}
