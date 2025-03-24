package Array;
import java.util.Scanner;
public class target_sum_triplet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        // taking input of array
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter sum target: ");
        int target=sc.nextInt();
        int count=0;
        // searching for triplets in array
        for(int i=0; i<=n-1; i++){
            for(int j=i+1; j<=n-1; j++){
                for(int k=j+1; k<=n-1; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        System.out.print("The total numbers of triplets, whose sum is equal to the "+target+" is "+count+".");
    }
}
