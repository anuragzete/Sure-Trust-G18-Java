package Arrays;

public class sumOfFirstLastArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6};
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            
            int sum = arr[start] + arr[end];
            System.out.println(sum);
            start++;
            end--;
        }
    }
}
