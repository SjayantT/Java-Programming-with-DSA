package Linked_List;
import java.util.Scanner;
public class removing_nth_node_from_last {
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static void display(Node head){
        Node temp=head;
        int size=0;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            size++;
        }
        System.out.println();
    }
    static Node removeNode(Node head, int n){
        Node slow=head;
        Node fast=head;
        for(int i=1; i<=n; i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.print("Enter the node's position that's you want to remove from last: ");
        int n=new Scanner(System.in).nextInt();
        display(a);
        a=removeNode(a,n);
        display(a);
    }
}
