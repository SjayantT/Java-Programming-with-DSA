package For_Loops;
import java.util.Scanner;
public class GP2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the term of GP series: ");
        int num= sc.nextInt();
        int a=4;
        System.out.println("The GP series upto "+num+" term: ");
        for(int i=1; i<=num; i++){
            System.out.print(a+" ");
            a=a*3;
        }
    }
}
