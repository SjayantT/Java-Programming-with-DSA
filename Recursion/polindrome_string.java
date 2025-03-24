package Recursion;
import java.util.Scanner;
public class polindrome_string {
    static String pollindrome(String s, int idx){  
        String ans=null;
        if(idx==s.length()) return ans;
        String smallAns=pollindrome(s, idx+1);
        ans=s.substring(idx, idx+1);
        return smallAns+ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a line: ");
        String s=sc.nextLine();
        // getting answer from the called function
        String ans=pollindrome(s, 0);
        if(s==ans) System.out.println("Pollindrome.");
        else System.out.println("Not Pollindrome.");
    }
}
