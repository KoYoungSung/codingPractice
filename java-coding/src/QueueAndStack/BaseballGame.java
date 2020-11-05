package QueueAndStack;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[] strs = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(solve(strs));
        
    }

    private static int solve(String[] strs) {
        //1
        Stack<Integer> stack = new Stack<>();

        //2
        for (String op : strs) {
            switch (op) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    int x = stack.pop();
                    int y = stack.pop();
                    int z = x + y;
                    stack.push(y);
                    stack.push(x);
                    stack.push(z);
                    break;

                default:
                    stack.push(Integer.valueOf(op));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum = +stack.pop();
        }
        return sum;
    }

}
/*
input["5","-2","4","C","D","9","+","+"]
output : 27
*/
