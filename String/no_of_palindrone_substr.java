package String;
import java.util.*;
public class no_of_palindrone_substr {
    static String reverse(String str){
        StringBuilder  gtr= new StringBuilder(str);
        int i=0, j=gtr.length()-1;
        while(i<j){
            char ch1=gtr.charAt(i);
            char ch2=gtr.charAt(j);
            gtr.setCharAt(i, ch2);
            gtr.setCharAt(j, ch1);
            i++;
            j--;
        }
        return gtr.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        int count=0;
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                String subString=str.substring(i, j);
                if(subString.equals(reverse(subString))){
                    count++;
                }
            }
        }
        System.out.println("The number of palindromic substring in string is: "+count);
    }
}
