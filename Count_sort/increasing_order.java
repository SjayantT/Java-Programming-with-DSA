package Count_sort;
import java.util.Scanner;

import Array.sorting_even_odd;
public class increasing_order {
    static void prefix(int count[]){
        for(int i=1; i<count.length; i++){
            count[i]+=count[i-1];
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
    static void count(int [] arr){
        int n=arr.length;
        int max=find_max(arr);
        // creating frequency array
        int count[]=new int[max+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        prefix(count);
        // putting elements in ans array in ascending order
        int ans[]=new int[n];
        for(int i=n-1; i>=0; i--){
            int idx=count[arr[i]]-1;
            ans[idx]=arr[i];
            count[arr[i]]--;
        }
        // copying elements of ans in arr
        for(int i=0; i<ans.length; i++){
            arr[i]=ans[i];
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // taking input of the array
        System.out.println("Enter elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        count(arr);
        // printing array after sorting in ascending array
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
