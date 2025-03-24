package if_else;
import java.util.Scanner;;
public class greatest_age {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the age of Ram: ");
        int ram=sc.nextInt();
        System.out.print("Enter the age of Shyam: ");
        int shyam=sc.nextInt();
        System.out.print("Enter the age of Ajay: ");
        int ajay= sc.nextInt();
        if(ram>shyam && ram>ajay){
            System.out.println("Ram is elder than Shyam and Ajay.");
        }
        else if(shyam>ram && shyam>ajay){
            System.out.println("Shyam is elder than Ram and Ajay.");
        }
        else{
            System.out.println("Ajay is elder than Ram and Shyam.");
        }
    }
}
