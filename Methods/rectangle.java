package Methods;
import java.util.Scanner;
class operations{
    float length,width;
    operations(float x, float y){
        length=x;
        width=y;
    }
    float perimeter(){
        return 2*(length+width);
    }
    float area(){
        return length*width;
    }
}
public class rectangle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        float a=sc.nextFloat();
        System.out.print("Enter width of rectangle: ");
        float b=sc.nextFloat();
        operations O= new operations(a, b);
        System.out.println("Perimeter of rectangle is: "+O.perimeter());
        System.out.println("Area of rectangle is: "+O.area());

    }
}
