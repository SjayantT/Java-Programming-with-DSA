package Methods;
import java.util.Scanner;
class calculation{
    float side;
    calculation(float x){
        side=x;
    }
    float perimeter(){
        return 4*side;
    }
    float area(){
        return side*side;
    }
    float cube(){
        return side*side*side;
    }
}
public class square {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        float s=sc.nextFloat();
        calculation S= new calculation(s);
        System.out.println("The perimeter of square is: "+S.perimeter());
        System.out.println("The area of square is: "+S.area());
        System.out.println("The cube of square is: "+S.cube());
    }
}
