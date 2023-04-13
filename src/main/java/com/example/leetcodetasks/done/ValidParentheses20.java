package com.example.leetcodetasks.done;

import java.util.Stack;


/**
 * Time Complexity O(n)
 */
public class ValidParentheses20 {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '{') || (s.charAt(i) == '[') || (s.charAt(i) == '(')) {
                stack.push(s.charAt(i));
            } else if ((s.charAt(i) == '}' && stack.peek() == '{')
                    || (s.charAt(i) == ']' && stack.peek() == '[')
                    || (s.charAt(i) == ')' && stack.peek() == '(')) {
                stack.pop();
            } else return false;
        }
        return stack.isEmpty();
    }
}
