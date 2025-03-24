package For_Loops;
import java.util.Scanner;
public class a_to_Power_b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter base value: ");
        int a= sc.nextInt();
        System.out.print("Enter the power value: ");
        int b= sc.nextInt();
        int power=1;
        for(int i=1; i<=b; i++){
            power=power*a;
        }
        System.out.print(a+" raised to power "+b+" is: "+power);
    }
}
