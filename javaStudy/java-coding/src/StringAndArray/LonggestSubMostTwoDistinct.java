package StringAndArray;

import java.util.HashMap;
import java.util.Map;

public class LonggestSubMostTwoDistinct {
    public static void main(String[] args) {

        String s = "ccaabb";
        System.out.println(solve(s));

    }

    private static int solve(String s) {
        //1
        int start = 0, end = 0, counter = 0, length = 0;
        Map<Character, Integer> map = new HashMap<>();

        //2
        while (end < s.length()) {
            char endChar = s.charAt(end);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);
            if(map.get(endChar)==1) counter++;
            end++;
            //3
            while (counter > 2) {
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar) - 1);
                if(map.get(startChar)==0) counter--;
                start++;
            }
            length = Math.max(length, end - start);
        }
        return length;
    }
}


/*
input String s = "ccaabb"

output : 5
"aabbb"
-----
1) end-start로 비교한 값을 length에 담는다
2) 문자를 2개 인식하기 위해서 counter(문자갯수)로 담는다 - 이떄 counter는 Map


 */