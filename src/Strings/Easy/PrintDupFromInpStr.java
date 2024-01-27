package Strings.Easy;

import java.util.Arrays;

public class PrintDupFromInpStr {
    public static void duplicateCnt(String str){
        char[] sortedArr = str.toCharArray();
        
        Arrays.sort(sortedArr);

        int cnt = 1;

        for (int i = 0; i < sortedArr.length - 1; i++) {
            if(sortedArr[i] == sortedArr[i+1])
            cnt++;
            else {
                if (cnt > 1) {
                    System.out.println(sortedArr[i] + ", " + cnt);
                }
                cnt = 1;
            }
        }
        if (cnt > 1) {
            System.out.println(sortedArr[sortedArr.length - 1] + ", " + cnt);
        }
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        duplicateCnt(str);
    }
}
