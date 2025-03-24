package String;
import java.util.*;
public class Reverse_each_word {
    static String reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        int st=0, end=sb.length()-1;
        while (st<end) {
            char ch1=sb.charAt(st);
            char ch2=sb.charAt(end);
            sb.setCharAt(st, ch2);
            sb.setCharAt(end, ch1);
            st++;
            end--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence to reverse each word of it: ");
        String str=sc.nextLine();
        String ans="";
        String gtr="";
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                gtr=gtr+ch;
            }
            else{
                ans=ans+reverse(gtr)+" ";
                gtr="";
            }
        }
        ans+=reverse(gtr);
        System.out.println("The string after reversing its each words: "+ans);
    }
}
 