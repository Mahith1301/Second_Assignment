//Write a Java program to sum the values of an array and the average value of array elements.
package second_assignment;
import java.util.Scanner;

public class q1 {
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
        //intially sum is zero
        int sum=0;
        //using for each loop to acess element in array
        for (int x:arr){
            sum+=x;
            System.out.println(x);
        }
        System.out.println(" sum of elements = "+sum);
        System.out.println(" avg of elements = "+(sum/arr.length));
    }
}
