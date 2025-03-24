package Binary_Search;
import java.util.Scanner;
public class first_occurence {
    static int first_Occurence(int[] arr, int x){
        int n=arr.length;
        int st=0, end=n-1; 
        int fo=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(x==arr[mid]){
                fo=mid;
                end=mid-1;
            }
            else if(x<arr[mid]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return fo; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // inserting elements in the array
        System.out.println("Enter elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target to find out its first occurence in the array: ");
        int x=sc.nextInt();
        int ans=first_Occurence(arr, x);
        System.out.print("The first occurence of "+x+" is: "+first_Occurence(arr, x));
    }
}
