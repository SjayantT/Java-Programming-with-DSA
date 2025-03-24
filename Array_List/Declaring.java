package Array_List;
import java.util.ArrayList;
import java.util.Scanner;
public class Declaring{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // declaring a array list
        ArrayList <Integer> nums= new ArrayList<>();
        // adding values in array list
        nums.add(5);
        nums.add(10);
        nums.add(16);
        // printing 
        System.out.println(nums.get(0));
        System.out.println(nums.get(1));
        System.out.println(nums.get(2));
        // printing directly
        System.out.println(nums);
    }
}
