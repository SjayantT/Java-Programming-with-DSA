package Linked_List;
public class odd_even_list2 {
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
    public static Node Odd_even(Node head){
        Node temp=head;
        Node odd=new Node(0);
        Node even=new Node(0);
        Node tempO=odd;
        Node tempE=even;
        while(temp!=null){
            tempO.next=temp;
            temp=temp.next;
            tempO=tempO.next;
            if(temp==null) break;
            tempE.next=temp;
            temp=temp.next;
            tempE=tempE.next;
        }
        odd=odd.next;
        even=even.next;
        tempO.next=even;
        return odd;
    }
    public static void main(String[] args){
        Node a=new Node(5);
        Node b=new Node(7);
        Node c=new Node(10);
        Node d=new Node(9);
        Node e=new Node(8);
        Node f=new Node(12);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        
        System.out.print("Input: ");
        display(a);

        Node newHead=Odd_even(a);

        System.out.print("Output: ");
        display(newHead);
    }
}
