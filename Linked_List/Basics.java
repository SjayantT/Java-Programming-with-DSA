 package Linked_List;
public class Basics {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        // System.out.println(a);
        Node b=new Node(7);
        // System.out.println(b);
        Node c=new Node(9);
        Node d=new Node(15);
        // System.out.println(a.next);
        // linking each node to its next node
        a.next=b;
        b.next=c;
        c.next=d;
        // printing b node using a
        System.out.println(a.next.data);
        // printing d node data using a node
        System.out.println(a.next.next.next.data);
        // printing last node next value;
        System.out.println(d.next); //null
    }
}
