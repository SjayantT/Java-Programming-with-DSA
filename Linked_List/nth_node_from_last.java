package Linked_List;
import java.util.Scanner;
public class nth_node_from_last {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node nthNode(Node head, int n){
        Node temp=head;
        int size=0;
        while (temp != null) {
            temp=temp.next;
            size++;
        }
        int m=size-n+1;
        temp=head;
        for(int i=1; i<m; i++){
            temp=temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node a=new Node(100);
        Node b=new Node(43);
        Node c=new Node(12);
        Node d=new Node(10);
        Node e=new Node(54);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.print("Enter the node that you want to search from last: ");
        int n=sc.nextInt();
        Node ans=nthNode(a,n);
        System.out.print("The value is: "+ans.data);
    }
}
