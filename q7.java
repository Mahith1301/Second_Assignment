//Write a Java program to find common elements between two integer arrays
import java.util.Scanner;

public class q {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("length of array1");
        Integer length1=sc.nextInt();
        //declare and inserting elements in array 1
        int arr1[]=new int[length1];
       
        for (int i=0;i<arr1.length;i++){
            System.out.println("enter elements of array1 at index "+i);
            arr1[i]=sc.nextInt();
        }

        System.out.println("length of array2");
        Integer length2=sc.nextInt();
        //declare and inserting elements in array 2
        int arr2[]=new int[length2];
       
        for (int i=0;i<arr2.length;i++){
            System.out.println("enter elements of array1 at index "+i);
            arr2[i]=sc.nextInt();
        }



        System.out.print("common elements are ");
        //using for loop to check element in array
        for (int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]+" ");
                }
            }
        }
    }
}
