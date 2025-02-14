package Arrays;

public class primeCompSumArr {
     public static void main(String[] args) {
        int[] arr = {4,2,1,5,9,8};
        int fact = 0;
        int primeSum = 0;
        int compSum = 0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] == 1) 
             continue;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) 
                    fact++;
            }if (fact <2) 
                primeSum += arr[i];
            else
                compSum += arr[i];
             }
        System.out.println(" Sum of prime no  from array : " +primeSum);
        System.out.println("SUm of composite no from array : " +compSum);
    }
    
}