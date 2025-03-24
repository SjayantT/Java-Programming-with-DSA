// two loop swap approach  or two pointer approach 
package Array;
import java.util.Scanner;
public class shoting_0_1_first {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of the array
        System.out.println("Enter the elements in the form of 0 & 1 in the array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        // sorting array 
        for(int i=0; i<=n-1; i++){
            for(int j=i+1; j<=n-1; j++){
                if(arr[i]==1 && arr[j]==0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The array after 0 & 1 sorting is: ");
        for(int i=0; i<=n-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}