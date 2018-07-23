package LessonFive;

import java.util.Arrays;

public class L5_1 {
    public static void main(String[] args) {
        String Value = "aafaa";

        System.out.println(Value);
        System.out.println(reverseString(Value));
        System.out.println(Value.equals(reverseString(Value)));
    }

    private static String reverseString(String Value) {
        StringBuilder reverse = new StringBuilder();

        for (int i = Value.length() - 1; i >= 0; --i) {
            reverse.append(Value.charAt(i));
        }
        return reverse.toString();

    }

    private static Boolean isPalindrome(String Value, String reverse) {
        return Value.equals(reverseString(reverse));

    }
}