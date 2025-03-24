package Doubly_LL;
public class circular {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node temp=head.next;
        System.out.print(head.data+" ");
        while(temp!=head){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(0);
        Node b=new Node(1);
        Node c=new Node(2);
        Node d=new Node(3);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=a;
        display(a);
    }
}
