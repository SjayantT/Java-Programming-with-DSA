package Raddix_Sort;
import java.util.Scanner;
public class ascending_order {
    static void prefix(int [] count){
        for(int i=1; i<count.length; i++){
            count[i]+=count[i-1];
        }
    }
    static void count(int[] arr, int place){
        int n=arr.length;
        // creating frequency array
        int count[]=new int[10];
        for(int i=0; i<n; i++){
            count[(arr[i]/place)%10]++;
        }
        prefix(count);
        // creating output array
        int ans[]=new int[n];
        for(int i=n-1; i>=0; i--){
            int idx=count[(arr[i]/place)%10]-1;
            ans[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        // copying output array in the original array (arr)
        for(int i=0; i<n; i++){
            arr[i]=ans[i];
        }
    }
    static int find_max(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(mx<arr[i]){
                mx=arr[i];
            }
        }
        return mx;
    }
    static void radix_sort(int [] arr){
        int max=find_max(arr);
        for(int place=1; max/place>0; place*=10){
            count(arr,place);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //taking input of the array
        System.out.println("Enter the elements in the array:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        // implementing raddix sort
        radix_sort(arr);
        // printing array after sorting in ascending order
        System.out.println("The array after sorting in ascending order: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
