package StringAndArray;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] list = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(list));
        
    }

    private static List<List<String>> groupAnagrams(String[] strs) {

        //1
        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0)
            return result;
        Map<String, List<String>> map = new HashMap<>();

        //2
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String key = String.valueOf(charArray);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }

        }
        result.addAll(map.values());
        return result;



    }
}

/*
input
["eat","tea","tan","ate","nat","bat"];

output
[
    ["ate","eat","tea"],
    ["nat","tan"],
    ["bat"]
]
---
1) map 이용
2) anagrams -> 소팅 (key ,List<String>
*/
