package Array;
import java.util.Scanner;
public class searching_duplicate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of array
        System.out.println("Enter "+n+" elements of array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();   
        }
        int duplicate=-1;
        // searching for duplicate element
        for(int i=0; i<=n-1; i++){
            for(int j=i+1; j<=n-1; j++){
                if(arr[i]==arr[j]){
                    duplicate=arr[i];
                    break;
                }
            }
        }
        if(duplicate==-1){
            System.out.println("There is no duplicate element in given array.");
        }
        else{
            System.out.println("The duplicate value in given array is: "+duplicate);
        }
    }
}
