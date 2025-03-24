package Linked_List;
public class find_intersection {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int length(Node head){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public static Node intersection(Node headA, Node headB){
        Node tempA=headA;
        Node tempB=headB;
        int m=length(headA);
        int n=length(headB);
        if(m>n){
            int x=m-n;
            for(int i=1; i<=x; i++) {
                tempA = tempA.next;
            }
        }
        else{
            int x=n-m;
            for(int i=1; i<=x; i++){
                tempB= tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
      return tempA;
    }
    public static void main(String[] args) {
        // first lst
       Node a = new Node(1);
       Node b = new Node(2);
       Node c = new Node(3);
       Node d = new Node(4);
       Node e = new Node(5);
       Node f = new Node(6);
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
       e.next=f;
       // second lst
       Node A = new Node(7);
       Node B = new Node(6);
       Node C = new Node(5);
       A.next=B;
       B.next=C;
       C.next=e;
       Node ans = intersection(a,A);
        System.out.println("The intersection of both Linked List is: "+ans.data);
    }
}
