package All_sorting_prob;
import java.util.Scanner;
public class Lexiographical_order {
    static void sort(String[] fruits){
        int n=fruits.length;
        for(int i=0; i<n-1; i++){
            int min_idx=i;
            for(int j=i; j<n; j++){
                if(fruits[min_idx].compareTo(fruits[j])>0){
                    min_idx=j;
                }
            }
            // swap between fruits[i] & fruits[min_idx]
            String temp=fruits[min_idx];
            fruits[min_idx]=fruits[i];
            fruits[i]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        String[] fruits=new String[n];
        // taking inputs of the fruits name as elements
        System.out.println("Enter fruits name in the given array: ");
        for(int i=0; i<n; i++){
            fruits[i]=sc.nextLine();
        }
        sc.close();
        sort(fruits);
        // printing fruits array after sorting in given order
        System.out.println("The fruits array after soting in given order is: ");
        for(int i=0; i<n; i++){
            System.out.print(fruits[i]+" ");
        }
    }
}
