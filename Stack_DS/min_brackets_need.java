package Stack_DS;
import java.util.*;
public class min_brackets_need {
    public static int min_brackets(String s){
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='(') st.push(ch);
            else if(ch==')'){
                if(st.size()==0) count++;
                else if(st.peek()=='(') st.pop();
            }
        }
        count=count+st.size();
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string of brackets: ");
        String s=sc.nextLine();
        int ans= min_brackets(s);
        System.out.println("The total numbers of brackets are: "+ans);
    }
}
