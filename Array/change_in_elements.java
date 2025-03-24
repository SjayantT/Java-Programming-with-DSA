package Array;
import java.util.Scanner;
public class change_in_elements {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of array
        System.out.println("Enter the elemsnts of array : ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        // updating the array
        for(int i=0; i<=n-1; i++){
            if(i%2==0){
                arr[i]+=10;
            }
            else{
                arr[i]*=2;
            }
        }
        // printing updated array
        System.out.println("The array after updation is: ");
        for(int i=0; i<=n-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
