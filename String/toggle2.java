package String;
import java.util.*;
public class toggle2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            int asci=(int)ch;
            if(ch==' ') continue;
            if(asci>=65 && asci<=90){
                asci=asci+32;
                ch=(char)asci;
                str=str.substring(0, i)+ch+str.substring(i+1);
            }else{
                asci=asci-32;
                ch=(char)asci;
                str=str.substring(0, i)+ch+str.substring(i+1);
            }
        }
        System.out.println("The string after toggle is: "+str);
    }
}
