package Array;
import java.util.Scanner;
public class searching_num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        // taking input of array elements 
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter a target number: ");
        int x=sc.nextInt();
        int idx=-1;
        // searching for target number
        for(int i=0; i<=n-1; i++){
            if(arr[i]==x){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            System.err.println("The number "+x+" did not fount in array.");
        }
        else{
            System.out.print("The number "+x+" is found in array at index "+idx+".");
        }
    }
}
