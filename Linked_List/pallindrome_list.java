package Linked_List;
public class pallindrome_list {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Boolean isPallindrome(Node head, Node temp){
        Node p1=head;
        Node p2=temp;
        while(p2!=null){
            if(p1.data!=p2.data){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    public static Node mid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(3);
        Node e=new Node(2);
        Node f=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node mid=mid(a); // determining mid of list
        Node temp=reverse(mid.next); // reversing list after the mid
        mid.next=temp; // connecting mid to new Node(temp);
        Boolean ans=isPallindrome(a,temp);  // comparing both list's elements
        if(ans==true) System.out.println("The given Linked-List is Pallindrome.");
        else System.out.println("The given Linked-List is not Pallindrome. ");
    }
}
