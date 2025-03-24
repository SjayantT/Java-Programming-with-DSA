package Stack_DS;
import java.util.Scanner;
public class nextGreaterByArray {
    public static int[] result(int[] arr){
        int n=arr.length;
        int res[]=new int[n];
        for(int i=0; i<n; i++){
            res[i]=-1;
            for(int j=i+1; j<n; j++){
                if(arr[j]>arr[i]){
                    res[i]=arr[j];
                    break;
                }
            }
        }
        return res;
    }
    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int[] res= result(arr);
        System.out.println("The original array is: ");
        display(arr);
        System.out.println("The resultant array is: ");
        display(res);
    }
}
