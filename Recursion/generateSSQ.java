package Recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class generateSSQ {
    static ArrayList<String> generate(String s){
        ArrayList<String> ans=new ArrayList<>();
        if(s.length()==0){
            ans.add(" ");
            return ans;
        }
        char current= s.charAt(0);
        ArrayList<String> smallAns=generate(s.substring(1));
        // for(int i=0; i<s.length(); i++){
        //     ans.add(smallAns.get(i));
        //     ans.add(smallAns.get(i)+current);
        // }
        for(String ss: smallAns){
            ans.add(ss);
            ans.add(current+ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a line: ");
        String s=sc.nextLine();
        ArrayList <String> ans=generate(s);
        System.out.println(ans);
    }
}
