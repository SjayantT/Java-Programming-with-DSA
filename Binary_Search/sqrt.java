package Binary_Search;
import java.util.Scanner;
public class sqrt {
    static int find_root(int x){
        int st=0, end=x;
        int ans=0;
        while(st<=end){
            int mid=st+(end-st)/2;
            int val=mid*mid;
            if(val==x){
                return mid;
            }
            else if(val>x){
                end=mid-1;
            }
            else{
                ans=mid;
                st=mid+1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find out its square root: ");
        int x=sc.nextInt();
        System.out.print("The square root of the given number is: "+find_root(x));
    }
}
