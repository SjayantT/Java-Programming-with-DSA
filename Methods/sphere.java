package Methods;
import java.util.Scanner;
class volume{
    float result(float r, float pie){
        float V= 4*pie*r*r*r/3;
        return V;
    }
}
public class sphere {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r=sc.nextFloat();
        float pie=3.1415f;
        volume V=new volume();
        float ans=V.result(r,pie);
        System.out.print("The volume of sphere is: "+ans);
    }
}
