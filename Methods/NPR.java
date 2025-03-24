package Methods;
import java.util.Scanner;
class factorial_npr{
    int fact(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
}
public class NPR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r=sc.nextInt();
        factorial_npr F= new factorial_npr();
        int fact_n=F.fact(n);
        int fact_nr=F.fact(n-r);
        int answer=fact_n/fact_nr;
        System.out.print("The answer of "+n+"P"+r+" is: "+answer);
    }
}
