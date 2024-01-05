package Array.Medium;

public class MaxWaterContain {
    public static int maxWater(int[] height){
        int n = height.length;
        int max = 0;

        //Naive Solution :- 
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int currMax = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, currMax);
            }
        }

        //Optimised Solution :- TC O(n) SC O(1)
        // int low = 0, high = n-1;

        // while (low < high) {
        //     int currMax = 0;

        //     currMax = Math.min(height[low], height[high]) * (high - low);
        //     max = Math.max(max, currMax);

        //     if(height[low] <= height[high])
        //     low++;
        //     else
        //     high--;
        // }

        return max;
    }
    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(maxWater(height));
    }
}
