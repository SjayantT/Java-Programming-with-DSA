package Selection_sort;
import java.util.Scanner;
public class decreasing_order {
    static void sort(int arr[]){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int max_idx=i;
            for(int j=i; j<n; j++){
                if(arr[max_idx]<arr[j]){
                    max_idx=j;
                }
            }
            // swap arr[i], arr[max_idx]
            int temp=arr[i];
            arr[i]=arr[max_idx];
            arr[max_idx]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // taking input if the array
        System.out.println("Enter elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        sort(arr);
        // printing array after sorting in decreasing order
        System.out.println("The array after sorting in decreasing order is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
