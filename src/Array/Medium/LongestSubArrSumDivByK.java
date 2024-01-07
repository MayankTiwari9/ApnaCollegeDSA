package Array.Medium;

import java.util.HashMap;

public class LongestSubArrSumDivByK {
    static int longestSubarrar(int[] a, int k){
        //Optimised Solution  :- TC O(n) SC O(n)
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;
        int sum = 0;

        map.put(0, -1);

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            int rem = sum % k;

            if(rem < 0){
                rem += k;
            }

            if(map.containsKey(rem)){
                max = Math.max(max, i - map.get(rem));
            }else{
                map.put(rem, i);
            }
        }

        return max;

        //Naive Solution :- TC O(n^2) SC O(0)
        // int max = 0;

        // for (int i = 0; i < a.length; i++) {
        //     int sum = 0;
        //     for (int j = i; j < a.length; j++) {
        //         sum = sum + a[j];

        //         if(sum % k == 0){
        //             max = Math.max(max, j - i + 1);
        //         }
        //     }
        // }


        // return max;
    }
    public static void main(String[] args) {
        int a[] = {2, 7, 6, 1, 4, 5};
        int k = 3;

        // int a[] = {-2, 2, -5, 12, -11, -1, 7};
        // int k = 3;

        System.out.println(longestSubarrar(a, k));
    }
}
