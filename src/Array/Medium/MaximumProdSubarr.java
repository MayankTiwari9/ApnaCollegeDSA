package Array.Medium;

public class MaximumProdSubarr {
    static int maxProd(int[] nums) {

        //Optimised Solution :- 
        int maxProd = nums[0];
        int minProd = nums[0];
        int max = maxProd;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < 0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);

            max = Math.max(max, maxProd);
        }

        //Naive Solution :- TC O(N^2) SC O(1)
        // int max = Integer.MIN_VALUE;

        // if(nums.length == 1)
        // return nums[0];

        // for (int i = 0; i < nums.length; i++) {
        //     int currMax = 1;

        //     for (int j = i; j < nums.length; j++) {
        //         currMax *= nums[j];
        //         max = Math.max(currMax, max);
        //     }
        // }

        return max;
    }
    public static void main(String[] args) {
        int nums[] = {2, 3, -2, 4};
        // int nums[] = {-2, 0, -1};

        System.out.println(maxProd(nums));
    }
}
