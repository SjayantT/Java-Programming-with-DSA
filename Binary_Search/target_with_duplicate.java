package Binary_Search;
import java.util.Scanner;
public class target_with_duplicate {
    static int search(int [] arr, int target){
        int n=arr.length;
        int st=0, end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target) return mid;
            else if(arr[st]==arr[mid] && arr[mid]==arr[end]) {
                st++;
                end--;
            }
            else if(arr[mid]<=arr[end]){
                if(target>arr[mid] && target<=arr[end]){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            } else{
                if(target>=arr[st] && target<arr[mid]){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
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
        System.out.print("Enter the target that's you want to search in the array: ");
        int target=sc.nextInt();
        System.out.println("The index of "+target+" is:"+search(arr,target));
    }
}
