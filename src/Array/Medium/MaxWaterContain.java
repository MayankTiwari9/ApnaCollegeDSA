package Array.Medium;

public class MaxWaterContain {
    public static int maxWater(int[] height){
        int n = height.length;
        int max = 0;

        int low = 0, high = n-1;

        while (low < high) {
            int currMax = 0;

            currMax = Math.min(height[low], height[high]) * (high - low);
            max = Math.max(max, currMax);

            if(height[low] <= height[high])
            low++;
            else
            high--;
        }

        return max;
    }
    public static void main(String[] args) {
        int height[] = {1, 1};

        System.out.println(maxWater(height));
    }
}
