package Recursion;
import java.util.Scanner;
public class remove_occurences_from_string {
    static String remove(String line, char target, int idx){
        String ans="";
        if(idx==line.length()) return ans;
        if(line.charAt(idx)!=target) ans=line.substring(idx,idx+1);
        String smallAns=remove(line, target, idx+1);
        return ans+smallAns;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String line=sc.nextLine();
        System.out.print("Enter a character, which you want to remove from the string: ");
        char target=sc.next().charAt(0);
        // taking ans from fuction
        String ans=remove(line, target,0);
        System.out.println(ans);
    }
}
