package For_Loops;
import java.util.Scanner;
public class Prime_or_composite {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();
        int a=0;
        for(int i=2;  i<=num-1; i++){
            if(num%i==0){
                a=1;
                break;
            }
        }
        if(num==0){
            System.out.println(num+" is not a prime or composite number.");
        }
        else if(a==0){
            System.out.println(num+" is a prime number.");
        }
        else{
            System.out.println(num+" is a composite number. ");
        }
    }
}
