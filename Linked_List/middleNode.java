package Linked_List;
public class middleNode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node mid(Node head){
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int mid_idx=size/2;
        temp=head;
        for(int i=1; i<=mid_idx;i++){
            temp=temp.next;
        }
        return temp;
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
        Node ans=mid(a);
        System.out.println("The middle node's value is: "+ans.data);
    }
}
