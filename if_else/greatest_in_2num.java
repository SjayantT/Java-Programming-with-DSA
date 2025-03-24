package if_else;
import java.util.Scanner;
public class greatest_in_2num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= sc.nextInt();
        System.out.print("Enter second number: ");
        int b= sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater than "+b );
        }
        else{
            System.out.println(b+" is grater than "+a);
        }
    }
}
