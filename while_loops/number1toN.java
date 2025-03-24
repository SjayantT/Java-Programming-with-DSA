package while_loops;
import java.util.Scanner;
public class number1toN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int i=1; 
        while(i<=n){
            System.out.print(i+ " ");
            i++;
        }
    }
}
