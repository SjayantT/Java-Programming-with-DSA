package Linked_List;
public class merge_without_extra_space {
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
                temp.next=temp1;
                temp=temp1;
                temp1=temp.next;
            }
            else{
                temp.next=temp2;
                temp=temp2;
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
        // list 1
       Node a=new Node(3);
       Node b=new Node(6);
       Node c=new Node(10);
       Node d=new Node(12);
       Node e=new Node(13);
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
         // list 2
        Node A=new Node(4);
        Node B=new Node(12);
        Node C=new Node(13);
        A.next=B;
        B.next=C;
        Node list=merge(a,A);
        System.out.println("The list after merging two lists is: ");
        display(list);
    }
}
