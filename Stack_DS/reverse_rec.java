package Stack_DS;
import java.util.*;
public class reverse_rec {
    public static void insert_at_bottom(Stack<Integer> st, int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int n=st.pop();
        insert_at_bottom(st, x);
        st.push(n);
        
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int x=st.pop();
        reverse(st);
        insert_at_bottom(st,x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements thats you want to insert im the Stack: ");
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        System.out.println("Insert the elements in the stack: ");
        for(int i=1; i<=n; i++){
            int x=sc.nextInt();
            st.push(x);
        }
        reverse(st);
        System.out.println("The stack after reverse: ");
        System.out.println(st );
    }
}
