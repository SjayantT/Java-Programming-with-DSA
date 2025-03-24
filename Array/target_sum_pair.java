package Array;
import java.util.Scanner;
public class target_sum_pair {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of array elements
        System.out.println("Enter "+n+" elements of array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target=sc.nextInt();
        int count=0;
        // searching for pairs
        for(int i=0; i<=n-1; i++){
            for(int j=i+1; j<=n-1; j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        System.out.print("The total numbers of pairs, whose sum is equal to the "+target+" is "+count+".");
    }
}
