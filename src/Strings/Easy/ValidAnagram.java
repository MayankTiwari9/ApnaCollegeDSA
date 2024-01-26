package Strings.Easy;

import java.util.Arrays;

public class ValidAnagram {
    static boolean validAnag(String s, String t){
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);


        char[] t1 = t.toCharArray();
        Arrays.sort(t1);

        if(s1.length != t1.length)
        return false;
        

        for (int i = 0; i < s.length(); i++) {
            if(s1[i] != t1[i])
            return false;
        }

        return true;

    }
    public static void main(String[] args) {
        // String s = "anagram";
        // String t = "nagaram";

        // String s = "rat";
        // String t = "car";

        String s = "a";
        String t = "ab";

        System.out.println(validAnag(s,t));
    }
}
