package Array;
import java.util.Scanner;
public class product_of_elements {
    static void product(int[] arr, int n){
        int product=1;
        for(int i=0; i<=n-1; i++){
            product=product*arr[i];
        }
        System.out.print("The product of array elements is: "+product);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        //input elements 
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        product(arr, n);
    }
}
