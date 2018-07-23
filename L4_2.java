package LessonForth;

import java.util.Arrays;

public class L4_2 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "  ");
        }

        System.out.print("\nChange: \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            for (int t = arr[i]; t > 0; t--) {
                if ((arr[i] > 0) && (arr[t - 1] == arr[i])) { // трубует уточнения
                    arr[t - 1] = 0;
                }


            }

        }
    }
}