package Binary_Search;
import java.util.Scanner;
public class target_rotated_array {
    static int search(int[] arr, int target){
        int n=arr.length;
        int st=0, end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target==arr[mid]) return mid;
            else if(arr[mid]<arr[end]) { // it means  mid to end is sorted
                if(target>arr[mid] && target<=arr[end]) st=mid+1;
                else end=mid-1;
            }
            else{ // st to mid is sorted
                if(target>=arr[st] && target<arr[mid]) end=mid-1;
                else st=mid+1;
            }
        }
        return -1;
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
        System.out.print("Enter target that's you want to search in roated array:");
        int target=sc.nextInt();
        System.out.println(search(arr, target));
    }
}
