package Binary_Search;
import java.util.Scanner;
public class recursive {  
    static boolean search(int[] arr, int target, int st, int end){
        if(st>end) return false;
        int mid=st+(end-st)/2;
        if(target==arr[mid]) return true;
        else if(target<arr[mid]) return search(arr, target, st, mid-1);
        else return search(arr, target, mid+1, end);
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // inserting elements in the array
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a target to search in the array: ");
        int target=sc.nextInt();
        if(search(arr, target, 0, n-1))
        System.out.println(target+" found in array. ");
        else System.out.println(target+ " not found in the array.");
    }
}
