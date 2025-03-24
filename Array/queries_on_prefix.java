package Array;
import java.util.Scanner;
public class queries_on_prefix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of array 
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        // calculating prefix sum
        for(int i=1; i<=n-1; i++){
            arr[i]=arr[i]+arr[i-1];
        }
        // query part 
        System.out.print("Enter the numbers of query: ");
        int q=sc.nextInt();
        for(int i=1; i<=q; i++){
            System.out.print("Enter the value of l: ");
            int l=sc.nextInt();
            System.out.print("Enter the value of r: ");
            int r=sc.nextInt();
            int prefix=arr[r]-arr[l-1];
            System.out.print("The prefix sum from "+l+" to "+r+" is: "+prefix);
            System.out.println();
        }
    }
}
