
// solve this with only one time
// traverse in list
package Linked_List;
import java.util.Scanner;
public class nth_node_from_last2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node nthNode(Node head, int n){
        Node slow=head;
        Node fast=head;
        for(int i=1; i<=n; i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a=new Node(100);
        Node b=new Node(200);
        Node c=new Node(300);
        Node d=new Node(400);
        Node e=new Node(500);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.print("Enter position that you want to find from the last of the list: ");
        int n=sc.nextInt();
        sc.close();
        Node ans=nthNode(a,n);
        System.out.println("The value of founded node is: "+ans.data);
    }
}
