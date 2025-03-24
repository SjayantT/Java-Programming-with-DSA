package Linked_List;
public class merge2lists {
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
    public static Node merge(Node head1, Node head2){
        Node temp1=head1;
        Node temp2=head2;
        Node head=new Node(100);
        Node temp=head;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                Node a=new Node(temp1.data);
                temp.next=a;
                temp=a;
                temp1=temp1.next;
            }
            else{
                Node a=new Node(temp2.data);
                temp.next=a;
                temp=a;
                temp2=temp2.next;
            }
        }
        if(temp1!=null){
            temp.next=temp1;
        }
        else{
            temp.next=temp2;
        }
        return head.next;
    }
    public static void main(String[] args) {
        // List 1 -->
        Node a=new Node(6);
        Node b=new Node(8);
        Node c=new Node(9);
        Node d=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        // List 2 -->
        Node A=new Node(3);
        Node B=new Node(7);
        Node C=new Node(11);
        A.next=B;
        B.next=C;

        Node List=merge(a,A);
        System.out.println("The new list after merging given 2 lists: ");
        display(List);
    }
}
