package Arrays;

import java.util.Scanner;

public class sumEvenOddPosArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int sum1 = 0;
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0) {
               sum += arr[i];
            }else{
                sum1 += arr[i];
            }
        }
        System.out.println("Sum of element at even pos : " + sum);
        System.out.println("Sum of element at odd pos : " + sum1);
    }
}
