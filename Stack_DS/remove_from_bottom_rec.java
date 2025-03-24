package Stack_DS;
import java.util.*;
public class remove_from_bottom_rec {
    public static void remove(Stack<Integer> st){
        if(st.size()==1){
            st.pop();
            return;
        }
        int x=st.pop();
        remove(st);
        st.push(x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements thats you want to insert in the Stack: ");
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        System.out.println("Insert the elements in the stack: ");
        for(int i=1; i<=n; i++){
            int x=sc.nextInt();
            st.push(x);
        }
        remove(st);
        System.out.println("The stack after removing last element: ");
        System.out.println(st);
    }
}
