package Insertion_sort;
import java.util.Scanner;
public class increasing_order {
    static void sort(int [] arr){
        int n=arr.length;
        for(int i=1; i<n; i++){
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // taking input of the array
        System.out.println("Enter elements in the array : ");
        for(int i=0; i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        sort(arr);
        // printing array after sorting in increasing order
        System.out.println("The array after sorting in increasing order: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
