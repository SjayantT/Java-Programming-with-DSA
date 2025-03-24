package Recursion;
import java.util.Scanner;
public class printSSQ {
    static void print(String s, String ans){
        if(s.length()==0){
            System.out.println(ans+" ");
            return;
        }
        char current=s.charAt(0);
        print(s.substring(1), ans+current);
        print(s.substring(1), ans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a line: ");
        String s=sc.nextLine();
        System.out.println("The possible subsequences of the given string is: ");
        print(s, "");
    }
}
