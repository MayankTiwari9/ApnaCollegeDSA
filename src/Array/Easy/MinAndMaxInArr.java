
public class MinAndMaxInArr {
    public static void minMaxSum(int[] arr){
        int n = arr.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if(arr[i] > max)
            max = arr[i];

            if(arr[i] < min)
            min = arr[i];
        }

        sum += min + max;

        System.out.println("min -> " + min + " " + "max -> " + max);
        System.out.println("Sum -> " + sum);
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 1};

        minMaxSum(arr);
    }
}
