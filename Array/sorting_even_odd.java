// i.e   arr={ 2,4,1,5,9,8,0}
// then after sorting the array arr={2,4,8,0,1,5,9}
package Array;
import java.util.Scanner;
public class sorting_even_odd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of the array
        System.out.println("Enter the elements of array : ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        // sorting array 
        for(int i=0; i<=n-1; i++){
            for(int j=i+1; j<=n-1; j++){
                if(arr[i]%2!=0 && arr[j]%2==0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        // printin the array after sorting 
        System.out.println("The array after sorting is : ");
        for(int i=0; i<=n-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
