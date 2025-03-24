package Doubly_LL;

public class data_structure {
    public static class Node{
        Node prev;
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class DLinkedList{
        Node head;
        Node tail;
        private int size;
        int length(){
            return size;
        }
        void insertAtEnd(int x){
            Node temp=new Node(x);
            size++;
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                temp.prev=tail;
                tail=temp;
            }
        }
        void insertAtStart(int x){
            Node temp=new Node(x);
            if(head==null){
                insertAtEnd(x);
            }
            else{
                temp.next=head;
                head.prev=temp;
                head=temp;
                size++;
            }
        }
        void insertAt(int idx, int x){
            Node temp=head;
            if(idx==size) {
                insertAtEnd(x);
                return;
            }
            else if(idx==0){
                insertAtStart(x);
                return;
            }
            else if(idx<0) {
                System.out.println("Note:: "+idx+" index is not correct.");
                return;
            }
            else if(idx>size) {
                System.out.println("Note:: "+idx+" index is not correct.");
                return;
            }
            Node t=new Node(x);
            for(int i=1; i<idx; i++){
                temp=temp.next;
            }
            temp.next.prev=t;
            t.next=temp.next;
            temp.next=t;
            t.prev=temp;    
            size++;
        }
        void remove(int idx){
            if(idx==0){
                head=head.next;
                head.prev=null;
                return;
            }
            if(idx==size-1){
                tail=tail.prev;
                tail.next=null;
                return;
            }
            if(idx<0 || idx>=size){
                System.out.println("Note:: "+idx+" index not availavle.");
                return;
            }
            Node temp=head;
            for(int i=1; i<idx; i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
        }
        int get(int idx){
            Node temp=head;
            if(idx>=size || idx<0) {
                System.out.println(" Note:: The index "+idx+" is not available.");
                return -1;
            }
            for(int i=1; i<=idx; i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void displayRev(){
            Node temp=tail;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.prev;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DLinkedList DLL=new DLinkedList();
        DLL.insertAtEnd(1);
        DLL.insertAtEnd(2);
        DLL.insertAtEnd(3);
        System.out.println("The length of doubly linked list is: "+DLL.length()); //3
        DLL.display(); // 1 2 3
        DLL.displayRev(); // 3 2 1
        DLL.insertAtStart(0);
        DLL.display(); // 0 1 2 3
        DLL.displayRev(); // 3 2 1 0
        System.out.println("The value of index 2 is: "+DLL.get(2)); // 2
        DLL.insertAt(2, 5);
        DLL.display(); // 0 1 5 2 3
        DLL.displayRev(); // 3 2 5 1 0
        DLL.insertAt(5, 7);
        DLL.display(); // 0 1 5 2 3 7
        DLL.remove(3);
        DLL.display();
        DLL.displayRev(); 
    }
}
