// reversing array without using an extra array
package Array;
import java.util.Scanner;
public class reverse_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of array
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        // reversing array 
        int i=0;
        int j=n-1;
        while(i<j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        // printing same array after reversing 
        System.out.print("The given array after reversing: ");
        for(int k=0; k<=n-1; k++){
            System.out.print(arr[k]+" ");
        }
    }
}