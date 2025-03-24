// 'x' is integer input by user, find the first comming index of this number from the user. 
package Array;
import java.util.Scanner;
public class unknown_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of array
        System.out.println("Enter the elements in array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter target number: ");
        int x= sc.nextInt();
        // checking array for x
        for(int i=0; i<=n-1; i++){
            if(arr[i]==x){
                System.out.print("The first index of "+x+" is: "+i);
                break;
            }
        }
    }
}                     
