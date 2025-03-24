package Recursion;
import java.util.Scanner;
import java.util.ArrayList;
public class insert_idx_inList {
    static ArrayList<Integer> search(int arr[],int target, int idx){
        ArrayList<Integer> ans=new ArrayList<>();
        if(idx==arr.length) return ans;
        if(arr[idx]==target) ans.add(idx);
        ArrayList<Integer>SmallAns=search(arr, target, idx+1);
        ans.addAll(SmallAns);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of the array
        System.out.println("Enter the elements in the array.");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter a target:");
        int target=sc.nextInt();
        ArrayList<Integer> ans= search(arr,target, 0);
        System.out.println("The indeces where "+target+ " found:");
        System.out.println(ans);
    }
}
