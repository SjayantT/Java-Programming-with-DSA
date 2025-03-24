package String;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        StringBuilder gtr=new StringBuilder(str);
        int st=0, end=gtr.length()-1;
        while(st<end){
            char ch1=gtr.charAt(st);
            char ch2=gtr.charAt(end);
            gtr.setCharAt(st, ch2);
            gtr.setCharAt(end, ch1);
            st++;
            end--;
        }
        str=""+gtr;
        System.out.println("The string after reverse is: "+str);
    }
}
