//	Write a Java program to insert an element (specific position) into an array.
import java.util.Scanner;

public class q4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("length of array");
        Integer length=sc.nextInt();
        //declare and inserting elements in array
        int arr[]=new int[length+1];
       
        for (int i=0;i<arr.length;i++){
            System.out.println("enter elements at index "+i);
            arr[i]=sc.nextInt();
        }
        //takin element and index from user
        System.out.println("enter element to be inserted ");
        Scanner el=new Scanner(System.in);
        int key=el.nextInt();
        System.out.println("enter index it need to be inserted ");
        int ind=el.nextInt();
        
        for(int i=arr.length;i<ind;i++){
            arr[i+1]=arr[i];
        }
        arr[ind]=key;

        for (int x:arr){
            System.out.print(x+" ");
        }

    }
}
