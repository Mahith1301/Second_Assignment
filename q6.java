//Write a Java program to find duplicate values in an array of string values.

import java.util.Scanner;

public class q6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("length of array");
        Integer length=sc.nextInt();
        //declare and inserting elements in array
        String arr[]=new String[length];
       
        for (int i=0;i<arr.length;i++){
            System.out.println("enter elements at index "+i);
            arr[i]=sc.next();
        }

        //using for loop to check strings are same in array
        System.out.print("duplicate elements are = ");
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
