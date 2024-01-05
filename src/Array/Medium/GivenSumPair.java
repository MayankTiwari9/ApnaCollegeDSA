package Array.Medium;

// import java.util.HashMap;

public class GivenSumPair {
    public static boolean sumPair(int[] arr, int x){

        // Better than naive :- TC O(n) SC O(n)
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        //     if(map.containsKey(x - arr[i]))
        //     return true;
        //     else
        //     map.put(arr[i], i);
        // }

        //Naive Solution :- TC O(N^2) SC O(1)
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if(arr[i] + arr[j] == x){
        //             return true;
        //         }
        //     }
        // }

        return false;
    }
    public static void main(String[] args) {
        // int arr[] = {11, 15, 6, 8, 9, 10};
        // int x = 16;

        // int arr[] = {11, 15, 26, 38, 9, 10};
        // int x = 35;

        int arr[] = {11, 15, 26, 38, 9, 10};
        int x = 45;

        System.out.println(sumPair(arr, x));
    }
}
