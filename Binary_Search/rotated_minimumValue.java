package Binary_Search;
import java.util.Scanner;
public class rotated_minimumValue {
    static int find_min(int[] arr){
        int n=arr.length;
        int st=0, end=n-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]<=arr[n-1]){
            ans=mid;
            end=mid-1;
        }   
            else {
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // inserting elements in the array
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The minimum value's index in the rotated array is: "+ find_min(arr));
    }
}
