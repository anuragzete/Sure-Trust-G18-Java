package ConditionsAndLoop;

import java.util.Scanner;

public class NnaturalNo {
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int i = 1;    
    int n = sc.nextInt();
    System.out.println("Value of n : " +n);
    while(i!=n){
       System.out.println(i);
       i++;
    }
    }
    
}
