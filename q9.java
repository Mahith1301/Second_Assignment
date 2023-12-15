//Write a Java program to find a missing number in an array.

import java.util.Scanner;


public class q9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("length of array");
        Integer length=sc.nextInt();
        //declare and inserting elements in array
        int arr[]=new int[length];
       
        for (int i=0;i<arr.length;i++){
            System.out.println("enter elements[1-"+length+"] at index "+i);
            arr[i]=sc.nextInt();
        }
        int arr1[]=new int[length];


        //using for loop to check element in array
        for (int i=0;i<arr.length;i++){
         
            arr1[arr[i]-1]=1;               

        }

        for(int i=0;i<arr1.length;i++){
            if (arr1[i]==0){
                    System.out.print((i+1)+" ");
            }
                
            }
        }   
    }

