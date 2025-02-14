package Arrays;

public class TwoSum{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 12;
       
        int curr;
        for (int i = 0; i < arr.length; i++) {
            int sum;
            curr = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                sum = curr + arr[j];
                if (sum == target) {
                  System.out.println(curr + " " + arr[j]);
                }
            }
      
        
        }
    }
}