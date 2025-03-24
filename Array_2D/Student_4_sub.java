package Array_2D;
import java.util.Scanner;
public class Student_4_sub {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int m=sc.nextInt();
        System.out.print("Enter the number of subject: ");
        int n=sc.nextInt();
        int arr[][]= new int[m][n+1]; //  n+1 ==>> 1 is extra colum for the roll no.
        // taking input 
        System.out.println("Enter the  every " + m + " student's roll number and " + n + "subject marks line by line: ");
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // printing the students data
        System.out.println(m+" students data with roll no and " + n + " subject are: ");
        for(int i=0; i<=m-1; i++){
            for(int j=0; j<=n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
