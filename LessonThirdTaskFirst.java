package JD1;

import java.util.Scanner;

public class LessonThirdTaskFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int inputValue = scanner.nextInt();
        int result=0;
        while (inputValue !=0){
            int ostatok = inputValue%10;
            result+=ostatok;
            inputValue/=10;
        }
        System.out.println(result);
    }
}

