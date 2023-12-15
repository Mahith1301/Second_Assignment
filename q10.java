//Write a Java program to find the second smallest element in an array.

import java.util.Scanner;


public class q10 {
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


        //using for loop to check element in array
        for (int x:arr){
            if(x==0){
                System.out.println("array contain element 0");
                break;
            }
            if(x==-1){
                System.out.println("array contain element -1");
                break;
            }
        }
        
        
    }
}
