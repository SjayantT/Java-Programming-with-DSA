package For_Loops;
import java.util.Scanner;
public class AP1 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the nth term of AP series: ");
    int n= sc.nextInt();
    int a=1;
    for(int i=1; i<=n;i++){
        System.out.print(a+" ");
        a+=2;
    }
  }  
}
