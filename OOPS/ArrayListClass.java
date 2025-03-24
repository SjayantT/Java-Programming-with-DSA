package OOPS;
import java.util.*;
public class ArrayListClass {
    public static class Arraylist{
        int arr[]=new int[5];
        int idx=0;
        int size=0;
        public void add(int x){
        if(size==arr.length-1){
            int brr[]=Arrays.copyOf(arr, arr.length*2);
            arr=Arrays.copyOf(brr, brr.length);
        }
            arr[idx]=x;
            idx++;
            size++;
        }
        public int get(int idx){
           return arr[idx];
        }
    }
    public static void main(String[] args) {
        Arraylist arr=new Arraylist();
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        System.out.println(arr.get(6));
    }
}
