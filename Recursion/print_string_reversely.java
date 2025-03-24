package Recursion;
import java.util.Scanner;
public class print_string_reversely {
    static void printString(String s, int idx){
        if(idx==s.length()) return;
        printString(s, idx+1);
        System.out.print(s.charAt(idx));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a line: ");
        String s=sc.nextLine();
        System.out.println("The reverse form of the given string is: ");
        printString(s, 0);
    }
}