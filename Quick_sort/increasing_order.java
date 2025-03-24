package Quick_sort;
import java.util.Scanner;
public class increasing_order {
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int[] arr, int l, int r){
        // step 1
        int pivot=arr[l];
        int count=0;
        for(int i=l; i<=r; i++){
            if(pivot>arr[i]) count++;
        }
        int pi=l+count;
        swap(arr,l,pi);
        // step 2
        int i=l, j=r;
        while(i<pi && j>pi){
            while(arr[i]<arr[pi]) i++;
            while(arr[j]>arr[pi]) j--;
            if(i<pi && j>pi){
                swap(arr,i,j);
            }
        }

        return pi;
    }
    static void sort(int[] arr, int l, int r){
        if(l>=r) return; 
        int pi=partition(arr, l, r);
        sort(arr,l,pi-1);
        sort(arr,pi+1,r);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // taking input of the array
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        sort(arr, 0, n-1);
        // printing array after sorting
        System.out.println("The array afetr sorting in increasing order: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }   
}
