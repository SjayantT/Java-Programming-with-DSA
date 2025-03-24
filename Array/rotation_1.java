// using another array
package Array;
import java.util.Scanner;
public class rotation_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        // taking input of the array 
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=new int[n];
        // rotating array by k steps
        System.out.print("Enter the rotation steps of array : ");
        int k= sc.nextInt();
        k=k%n;
        int j=0;
        // part 1
        for(int i=n-k; i<=n-1; i++){
            ans[j++]=arr[i];
        }
        // part 2
        for(int i=0; i<=n-k-1; i++){
            ans[j++]=arr[i];
        }
        // printing the answer array 
        System.out.println("The array after rotation is: ");
        for(int i=0; i<=n-1; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
