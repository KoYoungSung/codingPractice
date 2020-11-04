package StringAndArray;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        KthLargestElementInAnArray a = new KthLargestElementInAnArray();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(a.solve_array(nums, k));
        System.out.println(a.pq(nums, k));
    }


    private int solve_array(int[] nums, int k) {
        int length = nums.length;
        Arrays.sort(nums);
        return nums[length - k];
    }

    private int pq(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> a - b);

        for (int val : nums) {
            pq.offer(val);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();


    }

    public void print(int[] nums) {
        for (int num : nums) {
            System.out.println("num = " + num);
        }
    }
}
/*
문제
int[] nums = {3,2,1,5,6,4}
int k = 2;

output = 5
--
1) 오름차순 정렬
2) Priority Queue, k=2
*/
