package String;
import java.util.*;
public class character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        String ans="";
        ans=ans+str.charAt(0);
        int count=1;
        for(int i=1; i<str.length(); i++){
            char prev=str.charAt(i-1);
            char curr=str.charAt(i);
            if(prev==curr) count++;
            else{
                if(count>1) ans=ans+count;
                ans=ans+curr;
                count=1;
            }
        }
        if(count>1) ans=ans+count;
        System.out.println(ans);
    }
}
