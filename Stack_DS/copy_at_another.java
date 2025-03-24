package Stack_DS;
import java.util.*;
public class copy_at_another {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.print("Enter the no. of elements that you want to insert in the Stack: ");
        int n=sc.nextInt();
        System.out.println("Insert the elements in the array: ");
        for(int i=1; i<=n; i++){
            int x=sc.nextInt();
            st.push(x);
        }
        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            int x=st.pop();
            gt.push(x);
        }
        Stack<Integer> rt=new Stack<>();
        while(gt.size()>0){
            int x=gt.pop();
            rt.push(x);
        }
        System.out.println("The copied stack is: "+rt);
    }
}         
