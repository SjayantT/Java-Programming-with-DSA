package Array;
import java.util.Scanner;
public class max_element {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input 
        System.out.println("Enter the "+n+" elements of array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int index=0;
        // searching for maximum elements
        for(int i=0; i<=n-1; i++){
            if(max<arr[i]){
                max= arr[i];
                index=i;
            }
        }
        System.out.print(max+" is maximum value in given array and its index is "+index+".");

    }
}
