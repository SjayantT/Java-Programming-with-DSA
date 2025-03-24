package Stack_DS;
import java.util.*;
public class balanced_paranthesis {
    public static Boolean balanced(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            if(ch==')'){
                if(st.size()==0) return false; 
                if(st.peek()=='('){
                    st.pop();
                }
            }
        }
        if(st.size()!=0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string of paranthesis: ");
        String s=sc.nextLine();
        Boolean ans= balanced(s);
       if(ans) System.out.println("The string is balanced.");
       else System.out.println("The string is not balanced.");
       
    }
}
