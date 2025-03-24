package String;
import java.util.*;
public class toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        StringBuilder str=new StringBuilder(sc.nextLine());
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            int asci=(int)ch;
            if(ch==' ') continue;
            if(asci>=65 && asci<=90){
                asci=asci+32;
                ch=(char)asci;
                str.setCharAt(i, ch);
            }else{
                asci=asci-32;
                ch=(char)asci;
                str.setCharAt(i, ch);
            }
        }
        System.out.println("The string after toggle: "+str);
    }
}
