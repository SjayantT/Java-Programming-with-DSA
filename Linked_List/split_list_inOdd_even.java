package Linked_List;
public class split_list_inOdd_even {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node even(Node head){
        Node temp=head;
        Node h=new Node(100);
        Node t=h;
        while(temp!=null){
            if(temp.data%2==0){
                Node a=new Node(temp.data);
                t.next=a;
                t=a;
            }
            temp=temp.next;
        }
        return h.next;
    }
    public static Node odd(Node head){
        Node temp=head;
        Node h=new Node(100);
        Node t=h;
        while(temp!=null){
            if(temp.data%2!=0){
                Node a=new Node(temp.data);
                t.next=a;
                t=a;
            }
            temp=temp.next;
        }
        return h.next;
    }
    public static void main(String[] args) {
        Node a=new Node(19);
        Node b=new Node(22);
        Node c=new Node(25);
        Node d=new Node(10);
        Node e=new Node(15);
        Node f=new Node(20);
        Node g=new Node(31);
        Node h=new Node(32);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        Node even=even(a);
        Node odd=odd(a);
//        display(a);
        System.out.println("After spliting the list, even list is: ");
        display(even);
        System.out.println("After spliting the list, odd list is: ");
        display(odd);
    }
}
