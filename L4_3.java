package LessonForth;

import java.util.Arrays;

public class L4_3 {
    public static void main(String[] args) {
        int [] a = {1, 6, 3, 9};
        int [] b = {7, 5, 8, 0};
        int [] c = new int [a.length+b.length];

        for (int i = 0; i <c.length/2; i++) {
            if (a[i]>b[i]) {
                c[i+i] = b[i];
                c [i+i+1] = a [i];
            } else {
                c [i+i] = a [i];
                c [i+i+1] = b [i];
            }
        }
        System.out.println (Arrays.toString(c));
    }
}