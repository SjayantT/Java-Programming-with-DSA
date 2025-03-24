package Linked_List;
public class printing_by_loop {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(7);
        Node c=new Node(2);
        Node d=new Node(11);
        Node e=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // Node temp=a;
        // for(int i=1; i<=5; i++){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }
        Node temp=a;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
