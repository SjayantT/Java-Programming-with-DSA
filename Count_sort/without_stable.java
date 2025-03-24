package Count_sort;
import java.util.Scanner;
public class without_stable{
    static int find_max(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(mx<arr[i]){
                mx=arr[i];
            }
        }
        return mx;
    }
    static void sort(int arr[]){
        int n=arr.length;
        int max=find_max(arr);
        // creating frequency array
        int count[]=new int[max+1];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }
        // putting values in accending order in original array
        int k=0;
        for(int i=0; i<count.length; i++){
            for(int j=0; j<count[i]; j++){
                arr[k++]=i;
            }
        }
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
        sort(arr);
        // printing array
        System.out.println("Array after sorting in acsending order: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}