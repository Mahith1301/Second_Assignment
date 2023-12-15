//Write a Java program to find the maximum and minimum value of an array.

import java.util.Scanner;

public class q5 {
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

        int min=arr[0];
        int max=arr[0];
        //using for loop to check min and max element in array
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("maximum element = "+ max+" minimum element "+min);
    }
}
