package Arrays;

import java.util.Scanner;

public class sumOfOddEvenArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int sum1 = 0;
       int[] arr = new int[5];
       System.out.println("Enter array elements : ");
       for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
        if (arr[i] % 2 == 0) {
            sum +=arr[i];
         }
         else{
            sum1 +=arr[i];
         }
        }
       System.out.println("Sum of even no : " + sum);
       System.out.println("Sum of odd no : " + sum1);
    }
    
}
