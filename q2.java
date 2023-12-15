//Write a Java program to find the index of an array element.
package second_assignment;

import java.util.Scanner;

public class q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //taking length from user
        System.out.println("length of array");
        Integer length=sc.nextInt();
        //declare and inserting elements in array
        int arr[]=new int[length];
       
        for (int i=0;i<arr.length;i++){
            System.out.println("enter elements at index "+i);
            arr[i]=sc.nextInt();
        }

        System.out.println("enter element to be searched ");
        Scanner el =new Scanner(System.in);
        int key=el.nextInt();
        //using for loop to check element in array
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                    System.out.println(key+" element found at index "+i);
            }
        }
    }
}
