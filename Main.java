import java.util.*;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Starting point
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i); // Store index of '('
            } else {
                stack.pop(); // Match with '(' if possible

                if (stack.isEmpty()) {
                    stack.push(i); // New starting point
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek()); // Update answer
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()"));     // 2
        System.out.println(longestValidParentheses(")()())"));  // 4
        System.out.println(longestValidParentheses(""));        // 0
    }
}
