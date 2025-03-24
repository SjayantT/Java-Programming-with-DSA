package Array;
import java.util.Scanner;
public class diffrence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // input of array
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        // calculation
        int even_sum=0;
        int odd_sum=0;
        for(int i=0; i<=n-1; i++){
            if(i%2==0){
                even_sum+=arr[i];
            }
            else{
                odd_sum+=arr[i];
            }
        }
        int diffrence= even_sum-odd_sum;
        System.out.print("The diffrence between sum of even indeces and odd indeces elements is: "+diffrence);
    }
}
