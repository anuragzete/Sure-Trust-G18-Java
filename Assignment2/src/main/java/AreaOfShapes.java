package ConditionsAndLoop;

import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float area;
    final float pi = 3.14f;
    int option = sc.nextInt();
    System.out.println("Enter the options : " + option);
    System.out.println("Option : " + option);
    switch (option) {
      case 1:

            System.out.println("Area of Rectange :");
            float length = 3;
            float width = 5;
             area = length*width;
            System.out.println(area);
            break;
        case 2:
            System.out.println("Area of Square :");
            float side = 5;
             area = side*side;
             System.out.println(area);
            break;
        case 3 :  
           float rad = sc.nextFloat();
           System.out.println("Radius : " + rad);   
           area = pi*rad*rad;
           System.out.println("Area of Circle : " + area);
           break;
        default:
           System.out.println("Entered default value");
            break;
      }
    }
    
    

}
