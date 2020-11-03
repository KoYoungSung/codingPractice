package StringAndArray;

public class PlusOne {
    public static void main(String[] args) {
//        int[] digits = {1, 2, 3};
        int[] digits = {9, 9, 9};
//        int[] digits = {0, 0, 1};

         int[] result = plusOne(digits);

        for (int i : result) {
            System.out.println("i = " + i);
        }
    }

    private static int[] plusOne(int[] digits) {
        //1

        //2
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            }

            if (i == 0) {
                int[] result = new int[digits.length+1];
                result[0] = 1;
                return result;
            }

        }
        return digits;
    }
}
/*
문제
input [1,2,3]
output [1,2,4]

input [0,0,1]
output [0,0,2]

input [9,9,9]
output [1,0,0,0]

1)뒷자리부터 9가있는지 체크
2) 9가 아닌 경우는 해당자리수의 값을 +1
3) 9인 경우 배열 index 증가
4) 새로운 배열 result[0]=1 생성
 */
