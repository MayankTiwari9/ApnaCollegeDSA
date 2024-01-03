package Array.Medium;

public class FindMinInRotSortArr {
    public static int findMin(int[] nums){
        // int min = Integer.MAX_VALUE;

        //Optimised Solution :- TC O(log n) SC O(1) using binary search
        int low = 0, high = nums.length - 1;
        
        if(nums[low] <= nums[high])
            return nums[low];
        
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(mid > 0 && nums[mid] < nums[mid-1])
                return nums[mid];
            
            if(nums[mid] > nums[high])
                low = mid+1;
            else
                high = mid - 1;
        }
        
        return nums[low];

        //Naive Solution :- TC O(n) SC O(1)
        // for (int i = 0; i < nums.length; i++) {
        //     if(nums[i] < min)
        //     min = nums[i];
        // }

        // return min;
    }
    public static void main(String[] args) {
        int nums[] = {3, 4, 5, 1, 2}; //OP :- 1
        // int nums[] = {4,5,6,7,0,1,2}; //OP :- 0
        // int nums[] = {11, 13, 15, 17}; //OP :- 11

        System.out.println(findMin(nums));

        // int idx = findMin(nums);

        // System.out.println(nums[idx]);
    }
}
