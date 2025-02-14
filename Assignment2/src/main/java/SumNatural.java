package ConditionsAndLoop;

import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int i = 1;
    int sum = 0;
    int n = sc.nextInt();
    while(i <= n){
     sum += i;
     
     i++;
    }   
    System.out.println("Sum of number upto n: " +sum);
    }
  

}
