package JD1;

import java.util.Scanner;

public class LessonSecondTaskSecond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину первого дома: ");
        int a = scanner.nextInt();
        System.out.println("Введите длинну первого дома: ");
        int b = scanner.nextInt();
        System.out.println("Введите ширину второго дома: ");
        int c = scanner.nextInt();
        System.out.println("Введите длинну второго дома: ");
        int d = scanner.nextInt();
        System.out.println("Введите ширину участка: ");
        int e = scanner.nextInt();
        System.out.println("Введите длинну участка: ");
        int f = scanner.nextInt();

        if (a>0 && b>0 && c>0 && d>0 && e>0 && f>0){
            if (a+c<=e && a+d<=e && b+d<=f && b+c<=f) {
            System.out.println("Вмещается");
            } else {
                System.out.println("Не вмещается");
            }
        } else {
             System.out.println("Введено недопустимое значение");
            }
        }
    }

