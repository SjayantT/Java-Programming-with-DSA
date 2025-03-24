package For_Loops;
import java.util.Scanner;
public class AP3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
            System.out.print("Enter the term of AP series: ");
            int num= sc.nextInt();
            int a=1;
            System.out.println("The AP series upto "+num+" term: ");
            for(int i=1; i<=num; i++){
                System.out.print(i+" ");
                a=a+2;
            }
        }
    }

