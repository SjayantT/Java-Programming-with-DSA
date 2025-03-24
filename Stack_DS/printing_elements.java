package Stack_DS;
  import java.util.*;
public class printing_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter the no. of elements thats you want to insert in the stack: ");
        int n=sc.nextInt();
        System.out.println("Insert the elements in the stack: ");
        for(int i=1; i<=n; i++){
            int x=sc.nextInt();
            st.push(x);
        }
        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println("The stack is: ");
        while(gt.size()>0){
            System.out.print(gt.pop()+" ");
        }
    }
}
