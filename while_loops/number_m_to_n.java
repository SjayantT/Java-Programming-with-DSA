package while_loops;
import java.util.Scanner;
public class number_m_to_n {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter starting point: ");
        int m=sc.nextInt();
        System.out.print("Enter the ending point: ");
        int n=sc.nextInt();
        if(m<n){
            int i=m;
            while(i<=n){
                System.out.print(i+" ");
                i++;
            }
        }
        else{
            int i=m;
            while(i>=n){
                System.out.print(i+" ");
                i--;
            }
        }
    }
}
