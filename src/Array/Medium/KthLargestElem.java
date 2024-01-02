package Array.Medium;
import java.util.*;


public class KthLargestElem {
    public static int kthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
 
        for (int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);
 
            if (pq.size() > k)
                pq.poll();
        }
        
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println(kthLargest(nums1, k1)); // Output: 5

        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println(kthLargest(nums2, k2)); // Output: 4
    }
}
