package Binary_Search;
import java.util.Scanner;
public class last_occurence {
    static int last_Occurence(int[] arr, int x){
        int n=arr.length;
        int st=0, end=n-1;
        int lo=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(x==arr[mid]){
                lo=mid;
                st=mid+1;
            }
            else if(x<arr[mid]) end=mid-1;
            else{
                st=mid+1;
            }
        }
        return lo;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // inserting elements in the array
        System.out.println("Ente the elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a target to search its last occurence in the given array: ");
        int x=sc.nextInt();
        int ans=last_Occurence(arr, x);
        System.out.print("The last occurence of "+x+" is: "+last_Occurence(arr, x));
    }
}
