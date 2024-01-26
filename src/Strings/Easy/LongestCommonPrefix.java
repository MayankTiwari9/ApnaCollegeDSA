package Strings.Easy;

import java.util.*;

public class LongestCommonPrefix {
    static String longest(String str[]){
        StringBuilder res = new StringBuilder();
        Arrays.sort(str);
        
        String first = str[0];
        String last = str[str.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if(first.charAt(i) != last.charAt(i))
            return res.toString();

            res.append(first.charAt(i));
        }


        return res.toString();
    }
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};

        // String[] str = {"dog", "racecar", "car"};

        System.out.println(longest(str));
    }
}
