package Array;
import java.util.Scanner;
public class input_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // taking element by user
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        // printing array
        System.out.println("The array is: ");
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
