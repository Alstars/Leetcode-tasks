package com.example.leetcodetasks.done;

/**
 * Time Complexity O(n)
 * Space complexity O(n)
 */
public class RemovingStars2390 {

    public String removeStars(String s) {
        StringBuilder builder = new StringBuilder();
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '*') {
                counter++;
            } else if ((s.charAt(i) != '*') && (counter > 0)) {
                counter--;
            } else builder.append(s.charAt(i));
        }
        return builder.reverse().toString();
    }
}

