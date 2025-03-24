package Linked_List;
public class midNodeIn_even {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node right_mid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null){ // right middle node condition
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node left_mid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next.next!=null){ // left middle node condition
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node left=left_mid(a);
        Node right=right_mid(a);
        System.out.println("The element of left mid node is: "+left.data);
        System.out.println("The element of rigth mid node is:"+right.data);
    }
}
