package while_loops;
import java.util.Scanner;
public class odd_1_to_n {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            if(i%2!=0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
