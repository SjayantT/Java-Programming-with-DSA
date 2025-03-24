package Linked_List;
public class linkedList_data_str {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedList{
        Node head;
        Node tail;
        int size=0;
        int length(){
            return size;
        }
        void insertAtEnd(int val){
            Node temp=new Node(val);
            size++;
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
        }
        void insertAtStart(int val){
            Node temp=new Node(val);
            if(head==null){
                insertAtEnd(val);
            }else{
                temp.next=head;
                head=temp;
                size++;
            }
        }
        void insertAt(int idx, int val){
            Node t=new Node(val);
            if(idx==size){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtStart(val);
                return;
            }
            else if(idx>size){
                System.out.println("can not insert in given index "+idx);
                return;
            }
            Node temp=head;
            for(int i=1; i<=idx-1; i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int get(int idx){
            int ans=0;
            if(idx>=size){
                System.out.println("index not found in linked list. ");
            }
            else{
                Node temp=head;
                for(int i=0; i<=idx; i++)
                    if(i==idx){
                        ans=temp.data;
                    }
                    temp=temp.next;
            }

            return ans;
        }
        void remove(int idx){
            if(idx>=size){
                System.out.println("Index did not exist in linked list.");
                return;
            }
            else if(idx==0){
                head=head.next;
                return;
            }
            Node temp=head;
            for(int i=1; i<=idx-1; i++){
              temp=temp.next;  
            }
            temp.next=temp.next.next;
            if(idx==size-1){
                tail=temp;
            }
        }
    }
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.insertAtEnd(2);
        ll.insertAtStart(1);
        ll.insertAtEnd(3);
        ll.print();
        ll.remove(2);
        ll.print();
        System.out.println(ll.tail.data);
    }   
}