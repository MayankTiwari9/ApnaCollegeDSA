package Array.Easy;

public class MaximumSubarray {
    public static int maximumSub(int[] arr){
        int n = arr.length;
        int max = 0;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];

            if(currSum > max)
            max = currSum;

            if(currSum < 0)
            currSum = 0;
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,-1,7,8};

        System.out.println(maximumSub(arr));
    }
}
