package StringAndArray;

import java.util.HashMap;
import java.util.Map;

public class FindAnagramsMapping {
    public static void main(String[] args) {

        int[] A = {11, 27, 45, 31, 50};
        int[] B = {50, 11, 31, 45, 27};
        int[] result = anagramMapping(A, B);
        for (int i : result) {
            System.out.print(i);
        }
    }

    private static int[] anagramMapping(int[] A, int[] B) {
        //1
        int[] result = new int[A.length];
        Map<Integer, Integer> map = new HashMap<>();


        //2
        for (int i = 0; i < A.length; i++) {
            map.put(B[i], i); // 1 4 3 2 0
        }
        for (int i = 0; i < A.length; i++) {
            result[i] = map.get(A[i]);// 1 4 3 2 0
        }
        return result;
    }
}
/*
문제
int[] A = {11,27,45,31,50}
int[] B = {50,11,31,45,27}

A에 값이 B에 몇번째 요소에 위치하는가

output
[1 4 3 2 0]

1) Map을 이용 key value를 이용
2) Array B의 순서를 리턴
3) int[]
4) Map A의 값을 세팅
5) 꺼낼 떄는 B key 값으로 리턴된 걸 int[]
 */