package For_Loops;
import java.util.Scanner;
public class number_m_to_n {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the starting point: ");
        int m=sc.nextInt();
        System.out.print("Enter the ending point: ");
        int n= sc.nextInt();
        if(m<n){
            for(int i=m; i<=n; i++){
                System.out.print(i+" ");
            }
        }
        else{
            for(int i=m; i>=n; i--){
                System.out.print(i+" ");
            }
    }
}
}
