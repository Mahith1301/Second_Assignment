//Write a Java program to remove a specific element from an array.


import java.util.Scanner;

public class q3 {
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
        //taking elment that to be removed
        System.out.println("enter element to be deleted ");
        Scanner el=new Scanner(System.in);
        int key=el.nextInt();
        int k=0;
        //using for loop to check element in array
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                    k =i;
                    break;
            }
        }
        for (int i=k;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        System.out.println("elements in array after deletion");
        for (int x:arr){
            if(x==0){
                break;
            }
            System.out.print(x+" ");
        }
    }
}
