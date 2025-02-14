package Arrays;

import java.util.Scanner;

public class IncrementArr {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int[] arr = new int[5];
     System.out.println("Enter the array element :");
     for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
        System.out.print(arr[i] + " ");
     }
     System.out.println(" ");
     System.out.println("Each array element are incremented by 5 :");
     for (int i = 0; i < arr.length; i++) {
        arr[i] = arr[i] + 5;
        System.out.print(arr[i] + " ");
     }
     System.out.println(" ");
    }   
}
