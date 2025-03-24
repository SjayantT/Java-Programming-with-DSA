package Stack_DS;
import java.util.*;
public class insert_at_bottom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        for(int i=1; i<=6; i++){
            st.push(i);
        }
        System.out.println("Enter a element to insert at bottom of stack: ");
        int n=sc.nextInt();
        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            int x=st.pop();
            gt.push(x);
        }
        st.push(n);
        while(gt.size()>0){
            int x=gt.pop();
            st.push(x);
        }
        System.out.println("The stack after inserting element at bottom: "+st);
        sc.close();
    }
}