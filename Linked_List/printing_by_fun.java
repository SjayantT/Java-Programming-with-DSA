package Linked_List;

public class printing_by_fun {
    public static void display(Node head){
       
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(7);
        Node b=new Node(11);
        Node c=new Node(4);
        Node d=new Node(8);
        Node e=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
    }
}
