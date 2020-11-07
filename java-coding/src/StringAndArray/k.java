package StringAndArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class k {
    public static void main(String[] args) {
        Solution a = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        a.solution(array, commands);

    }
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        Arrays.sort(array);


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }


        String c = Arrays.toString(array);

        System.out.println(c);


        return answer;
    }
}
