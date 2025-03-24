package Stack_DS;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of elements that you want to insert in the Stack: ");
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        System.out.println("Insert "+n+" elements in the stack: ");
        for(int i=1; i<=n; i++){
            int x=sc.nextInt();
            st.push(x);
        }
        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println("The Stack after reverse: ");
        System.out.println(gt );
    }
}
