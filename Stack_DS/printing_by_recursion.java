package Stack_DS;
import java.util.*;
public class printing_by_recursion {
    public static void print(Stack<Integer> st){
        if(st.size()==0) return;
        int x=st.pop();
        print(st);
        System.out.print(x+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st= new Stack<>();
        System.out.print("Enter the no. of elements that's you want to insert in the stack: ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+ " elements in the stack: ");
        for(int i=1; i<=n; i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Your stack is: ");
        print(st);
    }
}
