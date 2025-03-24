package Binary_Search;
import java.util.Scanner;
public class search_target {
    static boolean search(int[] arr, int target){
        int n=arr.length;
        int st=0, end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target==arr[mid]) return true;
            else if(target<arr[mid]) end=mid-1;
            else st=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // inserting the elements in the array
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target that's you want to search in te array: ");
        int target=sc.nextInt();
        System.out.println(target+" "+search(arr,target));
    }
}
