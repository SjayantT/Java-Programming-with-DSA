package Bubble_sort;
import java.util.Scanner;
public class decreasing_order {
    static void sort(int [] arr){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            boolean check=false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]<arr[j+1]){
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
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of the array 
        System.out.println("Enter elements in the array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        System.out.println("The array after sorting in decreasing order: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
