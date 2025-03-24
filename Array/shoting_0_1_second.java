// one loop approach
package Array;
import java.util.Scanner;
public class shoting_0_1_second {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the size of array :");
        int n= sc.nextInt();
        int arr[]= new int[n];
        // taking input of the array 
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        // calculation
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]==1 &&arr[right]==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
        // printing the array after the sorting
        System.out.println("The array after the sorting: ");
        for(int i=0; i<=n-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
