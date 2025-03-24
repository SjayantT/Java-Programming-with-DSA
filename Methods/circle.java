package Methods;
import java.util.Scanner;
class Operation{
    float r;
    float pie=3.1415f;
    Operation(float i){
        r=i;
    }
    float area(){
        return pie*r*r;
    }
    float circumference(){
        return 2*pie*r;
    }
}
public class circle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float r=sc.nextFloat();
        Operation C= new Operation(r);
        System.out.println("The area of circle is: "+C.area());
        System.out.println("The circumference of circle is: "+C.circumference());
    }
}
