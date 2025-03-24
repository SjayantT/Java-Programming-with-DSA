package Linked_List;
public class odd_even_list {
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
    public static Node split(Node head){
        Node temp=head;
        Node odd=new Node(99);
        Node tempO=odd;
        Node even=new Node(100);
        Node tempE=even;
        while(temp!=null){
            if(temp.data%2==0){
                Node a=new Node(temp.data);
                tempE.next=a;
                tempE=a;
                temp=temp.next;
            }
            else{
                Node a=new Node(temp.data);
                tempO.next=a;
                tempO=a;
                temp=temp.next;
            }
        }
        odd=odd.next;
        even=even.next;
        tempO.next=even;
        return odd;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(15);
        Node c=new Node(22);
        Node d=new Node(9);
        Node e=new Node(5);
        Node f=new Node(17 );
        Node g=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        Node list=split(a);
        display(a);
        System.out.println("The final list is: ");
        display(list);
    }
}
