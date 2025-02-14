package ConditionsAndLoop;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int i = 1;
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       while(i !=n){
        if (i % 2 == 0) {
            System.out.println("Even no : " + i);
        }
        else{
            System.out.println("Odd no : " + i);
        }
        i++;
       }
    }
    
}
