package Selection_sort;
import java.util.Scanner;
public class increasing_order {
    static void sort(int arr[]){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int min_idx=i;       // min_index=i --> current idx
            for(int j=i; j<n; j++){
                if(arr[min_idx]>arr[j]){
                    min_idx=j;
                }
            }
            // swap current element(index=i), arr[min_idx](current minimum elements)
            // arr[i], arr[min_idx]
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // taking input of the array
        System.out.println("Enter elements in the array : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        // printing the sorted array
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
