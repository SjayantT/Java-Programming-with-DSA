package Stack_DS;
import java.util.*;
public class implementation_array {
    public static class Stack{
        private int arr[]=new int[5];
        int size=0;
        int idx=0;
        void push(int x){
            if(size==5){
                System.out.println("Stack Overflow...");
                return;
            }
            arr[idx]=x;
            idx++;
            size++;
        } 
        int pop(){
            int x=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            size--;
            return x;
        }
        int peek(){
            return arr[idx-1];
        }
        void display(){
            for(int i=0; i<size; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        boolean isFull(){
            if(idx>=5) return true;
            return false;
        }
        int capacity(){
            return 5;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // st.pop();
        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.capacity());
    }
}
