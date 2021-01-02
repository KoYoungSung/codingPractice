package StringAndArray;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
    public static void main(String[] args) {
        FindAllAnagrams a = new FindAllAnagrams();
        String txt = "BACDGABCDA";
        String pat = "ABCD";
        System.out.println(a.findAnagrams(txt, pat));
    }

    public List<Integer> findAnagrams(String txt, String pat) {
        //1
        List<Integer> result = new ArrayList<>();
        if (txt == null || txt.length() == 0 || pat == null || pat.length() == 0 || txt.length() < pat.length()) {
            return result;
        }

        //2
        int[] patArr = new int[256];
        for (int i = 0; i < pat.length(); i++) {
            patArr[pat.charAt(i)]++;
        }
        for (int i = 0; i < txt.length() - pat.length()+1 ; i++) {
            int[] txtArr = new int[256];
            for (int j = 0; j < pat.length(); j++) {
                txtArr[txt.charAt(i + j)]++;
            }
            if (check(patArr, txtArr)) {
                
                result.add(i);
            }
        }




        return result;
    }

    private boolean  check(int[] patArr, int[] txtArr) {
        for (int i = 0; i < patArr.length; i++) {
            if (patArr[i] != txtArr[i]) {
                return false;
            }
        }
        return true;
    }
}
/*
문제
String txt = "BACDGABCDA";
String pat = "ABCD";
- 애나그램 가능한 요소위치
output [0,5,6 ]

1) Pattern : ABCD 아스키값을 Array에 담는다 (65,66,67,68)
2) 대상소스(txt) 비교
3) txt , pat 이 같은지 비교
 */
