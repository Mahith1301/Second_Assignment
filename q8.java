//Write a Java program to find the second smallest element in an array.

import java.util.Scanner;
import java.util.Math;

public class q8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("length of array");
        Integer length=sc.nextInt();
        //declare and inserting elements in array
        int arr[]=new int[length];
       
        for (int i=0;i<arr.length;i++){
            System.out.println("enter elements at index "+i);
            arr[i]=sc.nextInt();
        }

        int small=arr[0];
        int second=arr[1];
        //using for loop to check maximum element in array
        for (int i=0;i<arr.length;i++){
            small=Math.min(small,arr[i]);
        }
        System.out.println("smallest element is "+small);
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=small){
                second=Math.min(second,arr[i]);
            }  
        }
        System.out.println("second largest element is = "+ second);
    }
}
