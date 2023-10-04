package Array.Easy;

// import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean isDuplicate(int[] arr){
        //Optimised Solution -> TC O(n) SC O(n)
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if(set.contains(arr[i]))
            return true;

            else
            set.add(arr[i]);
        }
        return false;

        //Naive Solution -> TC O(n log n) SC O(1)
        // int n = arr.length;
        // Arrays.sort(arr);

        // for (int i = 0; i < n - 1; i++) {
        //     if(arr[i] == arr[i+1])
        //     return true;
        // }

        // return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.println(isDuplicate(arr));
    }
}
