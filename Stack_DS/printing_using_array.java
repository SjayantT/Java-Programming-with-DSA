package Stack_DS;
import java.util.*;
public class printing_using_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter the no of elements thats you want to insert in stack: ");
        int n=sc.nextInt();
        System.out.println("Insert th elements in the stack:");
        for(int i=1; i<=n; i++){
            int x=sc.nextInt();
            st.push(x);
        }
        // inserting all the elements in the array
        int arr[]=new int[st.size()];
        for(int i=arr.length-1; i>=0; i--){
            arr[i]=st.pop();
        }

        System.out.println("The stack is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
