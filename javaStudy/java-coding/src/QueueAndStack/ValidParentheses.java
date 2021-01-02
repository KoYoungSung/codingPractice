package QueueAndStack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
//        String exp = "{()}";
        String exp = "([)]";
        System.out.println(solve(exp));
    }

    private static boolean solve(String s) {
        //1
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        //2
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ')':
                    if (!stack.empty() && stack.peek() == '(') {
                        stack.pop();
                    }
                    break;
                case '}':
                    if (!stack.empty() && stack.peek() == '{') {
                        stack.pop();
                    }
                    break;
                case ']':
                    if (!stack.empty() && stack.peek() == '[') {
                        stack.pop();
                    }
                    break;

                default:
                    stack.push(s.charAt(i));
                    break;
            }
        }
        return stack.empty();
    }

}

/*
input       output
"{[]}"      true
"()[]{}"    true
"([)]"      false
"(]"        false
 */
