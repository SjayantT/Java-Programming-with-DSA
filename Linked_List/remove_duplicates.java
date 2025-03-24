package Linked_List;
public class remove_duplicates {
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
    public static Node remove_duplicate(Node head){
        Node temp=head;
        while(temp!=null){
            Node runner=temp;
            while(runner.next!=null){
                if(runner.next.data==temp.data){
                    runner.next=runner.next.next;
                }
                else{
                    runner=runner.next;
                }
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        Node a=new Node(1);
        Node b=new Node(1);
        Node c=new Node(5);
        Node d=new Node(6);
        Node e=new Node(6);
        Node f=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println("The list before removing duplicates: ");
        display(a);
        Node ans=remove_duplicate(a);
        System.out.println("The list after removing duplicates: ");
        display(ans);
    }
}
