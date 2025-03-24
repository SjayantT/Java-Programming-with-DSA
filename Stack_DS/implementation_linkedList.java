package Stack_DS;
import java.util.*;
public class implementation_linkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Stack{
        Node head;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            if(size==0){
                head=temp;
                size++;
                return;
            }
            temp.next=head;
            head=temp;
            size++;
        }
        int peek(){
            return head.data;
        }
        int pop(){
            int x=head.data;
            head=head.next;
            size--;
            return x;
        }
        void display(){
            displayRev(head);
            System.out.println();
        }
        int size(){
            return size;
        }
        void displayRev(Node h){
            if(h==null) return;
            displayRev(h.next);
            System.out.print(h.data+" ");
        }
        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println(st.size());
    }
}
