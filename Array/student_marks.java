package Array;
import java.util.Scanner;
public class student_marks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // input
        System.out.println("Enter the marks of students: ");
        for(int i=0; i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        // calculation
        System.out.println("The studnets whose marks are under 30, their indeces are: ");
        for(int i=0; i<=n-1; i++){
            if(arr[i]<30){
                System.out.print(i+" ");
            }
        }
    }
}
