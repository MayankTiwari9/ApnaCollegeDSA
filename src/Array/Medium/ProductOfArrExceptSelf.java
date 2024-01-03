package Array.Medium;

public class ProductOfArrExceptSelf {
    public static void productArr(int[] nums){
        int n = nums.length;
        int result[] = new int[n];

        /// Optmised Solution :- TC O(n) SC O(1)
        int leftProduct = 1;

        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;

        for (int i = n-1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        // Naive Solution :- TC O(n^2) SC O(1)
        // for (int i = 0; i < result.length; i++) {
        //     result[i] = 1;
        // }

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums.length; j++) {
        //         if(i == j){
        //             continue;
        //         }
        //         else{
        //             result[i] = result[i] * nums[j];
        //         }
        //     }
        // }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static void main(String[] args) {
        // int nums[] = {1, 2, 3, 4};
        int nums[] = {-1, 1, 0, -3, 3};

        productArr(nums);
    }
}
