package ConditionsAndLoop;

import java.util.Scanner;

public class PrimeOrComposite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Neither prime nor composite");
        }else{
            boolean isPrime = true;
            for (int i = 2; i<=n-1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
                
            }
            if (!isPrime) {
                System.out.println("Not-Prime");
            }
            else{
             System.err.println("Prime");
            }
        }
    }
}