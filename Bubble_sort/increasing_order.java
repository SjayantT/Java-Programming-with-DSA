package Bubble_sort;
import java.util.Scanner;
public class increasing_order {
    static void sort(int[] arr){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            boolean check=false;
            for(int j=0; j<n-i-1; j++){ // swap arr[j] & arr[j+1]
                if(arr[j]>arr[j+1]){
                    check=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(check==false) return;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //taking input of the array
        System.out.println("Enter elements of the array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        // printing array after sorting 
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}