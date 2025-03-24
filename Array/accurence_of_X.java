package Array;
import java.util.Scanner;;
public class accurence_of_X {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        // taking input of array
        System.out.println("Enter the element in array: ");
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a number: ");
        int x=sc.nextInt();
        int count=0;
        // checking accurences
        for(int i=0; i<=n-1; i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.print("The total number of accurences of "+x+" is: "+count);
    }
}
