package Arrays;

import java.util.Scanner;

public class sumOfArr{
    public static void main(String[] args){
        int sum = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array elements : ");
      int[] arr = new int[5];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      } 
      
      for (int i = 0; i < arr.length; i++) {
        sum = sum+arr[i];
       
      }
      System.out.println("Sum of array elements are : " + sum);
    }
}