package Strings.Easy;

public class ConvertSentence {
    public static String convert(String[] str, String input){
        String output = "";
        int n = input.length();

        for (int i = 0; i < n; i++) {
            if(input.charAt(i) == ' ')
            output = output + "0";

            else{
                int pos = input.charAt(i) - 'A';

                output = output + str[pos];
            }
        }

        return output;
    }
    public static void main(String[] args) {
        String str[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7",
                "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };

        String input = "GEEKSFORGEEKS";

        System.out.println(convert(str, input));
    }
}

