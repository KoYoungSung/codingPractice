package StringAndArray;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarray(nums));
    }

    private static int maxSubarray(int[] nums) {
        //1
        int newSum = nums[0];
        int max = nums[0];

        //2
        for (int i = 0; i < nums.length; i++) {
            newSum = Math.max(nums[i], newSum + nums[i]);
            max = Math.max(newSum, max);
        }
        return max;

    }
}
/*
문제 : Subarray 중 합이 제일 큰 수 리턴

예제
int [] nums = {-2, 1,-3,4,-1,2,1,-5,4 }
                        <4 ,-1, 2, 1 > <- 이 부분
1) 새로운 값 = ({)새로운값(), 새로운값+Subarray값()) 비교
2) 1)에서 나온 max값을 따로 저장

new Math.max(새로운값, 기존 합한값)
Max = Math.max(newSum, max)
 */