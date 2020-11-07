package StringAndArray;

import java.util.HashMap;
import java.util.Map;
//미해결
public class TreeFrog {
    public static void main(String[] args) {
        System.out.println(solve("BCdef"));
    }


    private static String solve(String word) {
        String result = "";

        String[] array_word = new String[word.length()];
        String[] change_word = {"Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A"};

        Map<String, String> alpha = new HashMap<>();

        char[] alphabet = new char[26];

        for (int i = 0; i < alphabet.length; i++) {
            alpha.put(Character.toString((char) ('A' + 1)), change_word[i]);
        }
        array_word = word.split("");

        for (String c_word : array_word) {
            boolean isUp = Character.isUpperCase(c_word.charAt(0));

            String temp_result = alpha.get(c_word.toUpperCase());
            if (temp_result == null) {
                temp_result = "";
            } else if (!isUp) {
                temp_result = temp_result.toLowerCase();
            }
            result = result.concat(temp_result);
        }
        return result;

    }
}
