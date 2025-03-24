package Methods;
import java.util.Scanner;
class factorial{
    int fact(int n){
        int F=1;
        for(int i=1;i<=n;i++){
            F=F*i;
        }
        return F;
    }
}
public class NCR {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r=sc.nextInt();
        factorial f= new factorial();
        int fact_n= f.fact(n);
        int fact_r=f.fact(r);
        int fact_nr=f.fact(n-r);
        int Answer= fact_n/(fact_r*fact_nr);
        System.out.print("The answer of "+n+"c"+r+" is:"+Answer);
    }
}
