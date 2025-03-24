package Binary_Search;
import java.util.Scanner;
public class search_2D_Array2 {
    static boolean search(int[][] arr, int target){
        // int m=arr.length; // no use
        int n=arr[0].length;
        int st=0, end=n-1;
        while(st<0 || end>=n){
            if(target==arr[st][end]) return true;
            if(target<arr[st][end]){
                end--;
            }else{
                st++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows of array: ");
        int m=sc.nextInt();
        System.out.print("Enter number of colums of array: ");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        // taking input of the elements of the array
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter a target to search in the array:" );
        int target=sc.nextInt();
        System.out.println(target+" found:"+search(arr,target));
    }
}
