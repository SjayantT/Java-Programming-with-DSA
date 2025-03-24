package Binary_Search;
import java.util.Scanner;
public class peak_element2 {
    static int peak(int[] arr){
        int n=arr.length;
        int st=0, end=n-1;
        int ans=0;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                ans=arr[mid];
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                st=mid+1;
            }
            else{
                end=mid-1;
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
        System.out.println("The peak element in the given array is: "+peak(arr));
    }
}
