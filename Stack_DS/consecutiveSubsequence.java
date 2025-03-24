package Stack_DS;
import java.util.*;
public class consecutiveSubsequence {
    public static int[] remove(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<n; i++){
            if(st.size()==0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(st.peek()==arr[i]){
                if(i==n-1){
                    st.pop();
                }
                else if(arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int res[]=new int[st.size()];
        for(int i=res.length-1; i>=0; i--){
            res[i]=st.pop();
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
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];   
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int[] res=remove(arr);
        System.out.println("The original array is: ");
        display(arr);
        System.out.println("The array after removinf the consecutive subsequences is: ");
        display(res);
    }
}
