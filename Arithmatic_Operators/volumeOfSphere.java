package Arithmatic_Operators;
import java.util.Scanner;
public class volumeOfSphere {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter radius: ");
    float radius= sc.nextFloat();
    float pie= 3.1415f;
    float volume= 4*pie*radius*radius*radius/3;
    System.out.print("The volume of sphere is: "+volume);
}
}
