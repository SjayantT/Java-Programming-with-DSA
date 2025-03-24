// reversing an array using another array.
package Array;
import java.util.Scanner;
public class reverse_1 {
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

        int brr[]= new int[n];
        // reversing array
        for(int i=0; i<=n-1; i++){
            brr[i]= arr[n-1-i];
        }
             
                //// OR ////
                // int j=0;
                // for(int i=n-1; i>=0; i--){
                //     brr[j++]=arr[i];
                // }

        // printing reversed array
        System.out.println("The array after reversing is: ");
        for(int i=0; i<=n-1; i++){
            System.out.print(brr[i]+" ");
        } 
    }
}
