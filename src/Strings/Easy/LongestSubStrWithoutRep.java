package Strings.Easy;

import java.util.Arrays;

public class LongestSubStrWithoutRep {
    public static int longest(String s){
        int n = s.length();
        int res = 0;

        //Optimised :- TC O(n)
        int[] prev = new int[256];
        Arrays.fill(prev, -1);

        int i = 0;

        for(int j = 0 ; j < n; j++){
            i = Math.max(i, prev[s.charAt(j)] + 1);
            int maxend = j - i + 1;
            res = Math.max(res, maxend);
            prev[s.charAt(j)] = j;
        }

        // Better than Naive :- TC O(n^2)
        // for(int i = 0; i < n; i++){
        //     boolean[] visited = new boolean[256];
        //     for(int j = i; j < n; j++){
        //         if(visited[s.charAt(j)] == true)
        //         break;

        //         else{
        //             res = Math.max(res, j - i + 1);
        //             visited[s.charAt(j)] = true;
        //         }
        //     }
        // }

        // Naive Solution ;- TC O(n^3)
        // for(int i = 0; i < n; i++)
        //     for(int j = i; j < n; j++)
        //         if(areDistinct(s, i , j))
        //         res = Math.max(res, j - i + 1);

        return res;
    }

    // public static boolean areDistinct(String s, int i, int j){
    //     boolean[] visited = new boolean[256];

    //     for(int k = i; k <= j; k++){
    //         if(visited[s.charAt(k)] == true)
    //         return false;

    //         visited[s.charAt(k)] = true;
    //     }

    //     return true;
    // }
    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(longest(s));
    }
}
