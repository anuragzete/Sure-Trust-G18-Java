package Arrays;

import java.util.Arrays;

public class RemDupArr {
    public static void main(String[] args) {
        int k = 0;
        int arr[] = {3,2,5,7,1,3,2,1,9,5};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
           if (i == 0 || arr[i] != arr[i-1]) {
              arr[k] = arr[i];
              k++;
           } 
        }
        System.out.println("After removing duplicates: ");
        for (int  i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
