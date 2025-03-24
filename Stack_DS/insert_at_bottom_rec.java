package Stack_DS;
import java.util.*;
public class insert_at_bottom_rec {
    public static void insert_at_bottom(Stack<Integer> st, int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int n=st.pop();
        insert_at_bottom(st, x);
        st.push(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements that's you want to insert in Stack: ");
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        System.out.println("Insert "+n+" elements in the Stack:");
        for(int i=1; i<=n; i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Enter element that you want to insert at bottom: ");
        int x=sc.nextInt();
        insert_at_bottom(st,x);
        System.out.println("Your stack after inserting element at bottom: ");
        System.out.println(st);
    }
}
