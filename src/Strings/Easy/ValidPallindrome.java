package Strings.Easy;

public class ValidPallindrome {
    static boolean validPall(String S){
        String str = S.toLowerCase().replaceAll("[^a-z0-9]", "");


        int start = 0, end = str.length() - 1;

        while (start < end) {
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {
        // String S = "A man, a plan, a canal: Panama";
        // String S = "race a car";
        String S = " ";

        System.out.println(validPall(S));
    }
}
