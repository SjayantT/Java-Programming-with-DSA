package Bucket_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ascending_order {
    static void Bucket_Sort(float[] arr){
        int n=arr.length;
        // buckets
        ArrayList<Float>[] buckets =new ArrayList[n];
        // creating empty buckets
        for(int i=0; i<buckets.length; i++){
            buckets[i]=new ArrayList<>();
        }
        // putting values in empty buckets
        for(int i=0; i<arr.length; i++){
            int idx= (int) arr[i]*n;
            buckets[idx].add(arr[i]);
        }
        // sorting all the buckets individually
        for(int i=0; i<buckets.length; i++){
           Collections.sort(buckets[i]);
        }
        // merge all the buckets to find final sorted array
        int idx=0;
        for(int i=0; i<buckets.length; i++){
            ArrayList<Float> curr=buckets[i];
            for(int j=0; j<curr.size(); j++){
                arr[idx++]=curr.get(j);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n=sc.nextInt();
        float[] arr=new float[n];
        // taking input of the array
        System.out.println("Enter elements in the given array: ");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextFloat();
        }
        Bucket_Sort(arr);
        // printing array after sorting in ascending array
        System.out.println("The array after sorting in ascending order: ");
        for (float f : arr) {
            System.out.print(f+" ");
        }
    }
}
