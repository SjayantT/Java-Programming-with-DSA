package Binary_Search;
import java.util.Scanner;
public class search_2D_array {
    static boolean search(int[][] arr, int target){
        int m=arr.length, n=arr[0].length;
        int st=0, end=m*n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int elements=arr[mid/n][mid%n];
            if(target==elements) return true;
            else if(target<elements){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows of the colum: ");
        int m=sc.nextInt();
        System.out.print("Enter the number of colums of the array: ");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        // inserting elements in the array
        System.out.println("Enter elements in the array: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter a target to search that in 2D array: ");
        int target=sc.nextInt();
        System.out.println(target+" found in array: "+search(arr,target));
    }
}