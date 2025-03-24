package Linked_List;
public class beginsOfCycle {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node cycleBegins(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        Node temp=head;
        while(temp!=slow){
            slow=slow.next;
            temp=temp.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=b;
        Node ans=cycleBegins(a);
        System.out.println("The element of the node from where the cycle starts is: "+ans.data);
    }
}
