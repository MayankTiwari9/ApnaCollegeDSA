package Array.Medium;

import java.util.*;

public class KthSmallestElem {
    public static int kSmall(int[] arr, int k, int l, int r){
        // Arrays.sort(arr);

        //Naive Solution  :- TC O(n) SC O(n)
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        while(pq.size() > k) {
            pq.poll();
        }

        return pq.peek();

        //Optimised Solution :- TC O(log n) SC O(1)

        // while (l < r) {
        //     int mid = (l + r) / 2;
        //     if(mid == k - 1)
        //     return arr[mid];
        //     else if(mid < k-1)
        //     l = mid + 1;
        //     else
        //     r = mid - 1;

        // }

        // return -1;
    }
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 20, 15};
        int k = 4;
        int l = 0;
        int r = 4;

        // int arr[] = {7, 10, 4, 3, 20, 15};
        // int k = 3;
        // int l = 0;
        // int r = 5;
        
        System.out.println(kSmall(arr, k, l, r));
    }
}
