package Array_List;
import java.util.ArrayList;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements of the array list: ");
        int n=sc.nextInt();
        ArrayList<Integer> nums= new ArrayList<>(n);
        System.out.println("Enter the elements in the array list: ");
        for(int i=0; i<=n-1; i++){
            int element=sc.nextInt();
            nums.add(element);
        }
        System.out.println("The array list is: ");
        for(int i=0; i<=n-1; i++){
            System.err.print(nums.get(i)+" ");
        }
        System.out.println();
        // adding element in an index
        nums.add(1,100);
        System.out.println("After adding a value: ");
        System.out.println(nums);
        
        // changing value in a particular index
        nums.set(0, 5);
        System.out.println("After changing the value of any index: ");
        System.out.println(nums);

        // remove any value from array list
        System.out.print("Enter a value which you want to remove: ");
        int remove=sc.nextInt();
        nums.remove(Integer.valueOf(remove));
        System.out.println(nums);

        // to check the value is in the array list
        System.out.print("Enter a value which you want to check that is avaible in array list: ");
        int check=sc.nextInt();
       System.out.println( nums.contains(Integer.valueOf(check)));   // return only boolean value

    }
}