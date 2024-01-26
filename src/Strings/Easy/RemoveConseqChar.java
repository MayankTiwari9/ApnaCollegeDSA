package Strings.Easy;

public class RemoveConseqChar {
    public static String removeConsecutive(String S){
        StringBuilder res = new StringBuilder();

        res.append(S.charAt(0));

        for (int i = 1; i < S.length(); i++) {
            if(S.charAt(i) != S.charAt(i - 1))
            res.append(S.charAt(i));
        }

        return res.toString();
    }
    public static void main(String[] args) {
        String str = "aabb";
        // String str = "aabaa";

        System.out.println(removeConsecutive(str));
    }
}
