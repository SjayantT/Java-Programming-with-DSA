package Array;
import java.util.Scanner;
public class min_element {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // input of array
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        int  min=arr[0];
        int index=0;
        // searching for minumum element
        for(int i=0; i<=n-1; i++){
            if(min>arr[i]){
                min=arr[i];
                index=i;
            }
        }
        System.out.print(min+" is minimum value element of given array and its index is "+index+".");
    }
}
