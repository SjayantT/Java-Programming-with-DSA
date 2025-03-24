package Array;
import java.util.Scanner;
public class rotatation_2 {
    static void rotate(int[] arr, int i, int j ){
        while(i<j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of array 
        System.out.println("Enter the elements of array : ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        // taking input of rotation steps 
        System.out.print("Enter the rotation input: ");
        int k =sc.nextInt();
        k=k%n;
        rotate(arr, n-k,n-1);
        rotate(arr, 0, n-k-1);
        rotate(arr, 0, n-1);
        // printing array after rotation
        System.out.println("The array after rotation is: ");
        for(int i=0; i<=n-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
