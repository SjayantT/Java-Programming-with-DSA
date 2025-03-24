package Stack_DS;
import java.util.*;
public class remove_from_bottom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements thats you want to insert in the satck: ");
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        System.out.println("Insert elements in the stack: ");
        for(int i=1; i<=n; i++){
            int x=sc.nextInt();
            st.push(x);
        }
        Stack<Integer> gt=new Stack<>();
        while(st.size()>1){
            gt.push(st.pop());
        }
        st.pop();
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println("The stack after removing the elements from the last: ");
        System.out.println(st);
    }
}
