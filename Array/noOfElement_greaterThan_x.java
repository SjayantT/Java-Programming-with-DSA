package Array;
import java.util.Scanner;
public class noOfElement_greaterThan_x {
   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // taking input of array
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a target number: ");
        int x=sc.nextInt();
        // calculation 
        int count=0;
        for(int i=0; i<=n-1; i++){
            if(arr[i]>x){
                count++;
            }
        }
        if(count==0){
            System.out.print("There are no element which is greater than "+x+".");
        }
        else{
            System.out.print("The number of element whuch is greater than "+x+" is: "+count);
        }
    } 
}
