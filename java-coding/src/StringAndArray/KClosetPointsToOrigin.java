package StringAndArray;

import java.util.PriorityQueue;
import java.util.Queue;

public class KClosetPointsToOrigin {
    public static void main(String[] args) {
        KClosetPointsToOrigin a = new KClosetPointsToOrigin();
        int k = 1;
        int[][] points = {{3, 3}, {2,-2}};
//        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
//        int k = 2;
        int[][] results = solve(points, k);
        a.print(results);
    }

    private static int[][] solve(int[][] points, int k) {

        Queue<int[]> queue = new PriorityQueue<>((a,b)->(a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1]));

        int[][] result = new int[k][2];
        int index = 0;

        for (int[] p : points) {
            queue.offer(p);
        }
        while (index < k) {
            result[index] = queue.poll();
            index++;
        }
        return result;
    }

    public void print(int[][] result) {
        int m = result.length;
        int n = result[0].length;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
        }

    }


}
/*
Problem : 0,0으로부터 가장 거리가 가까운 지점 구하기
input : points=[[1,3],[-2,2]], k = 1
output : [[-2,2]]

(0,0)(1,3) and the origin is sqrt(10) 1+9
(0,0)(-2,2) and the origin is sqrt(8) 4+4
 */
