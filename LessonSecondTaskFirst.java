package JD1;

import java.util.Scanner;

public class LessonSecondTaskFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день: ");
        int day = scanner.nextInt();
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.println("Введите год: ");
        int year = scanner.nextInt();

        if (isDateValid(day, month, year)) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
                if ((1<=day) && (day <= 30)) {
                    day++;
                    System.out.println(day + "." + month + "." + year);
                } else if (day == 31){
                    month++;
                    day = 1;
                    System.out.println(day + "." + month + "." + year);
                }
            } else if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    if ((1<=day)&&(day <= 28)){
                        day++;
                        System.out.println(day + "." + month + "." + year);
                    } else if(day == 29) {
                        month++;
                        day = 1;
                        System.out.println(day + "." + month + "." + year);
                    }
                } else {
                    if ((1<=day)&&(day <= 27)){
                        day++;
                        System.out.println(day + "." + month + "." + year);
                    } else if(day == 28) {
                        month++;
                        day = 1;
                        System.out.println(day + "." + month + "." + year);
                    }
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (1<=day && day <= 29){
                    day++;
                    System.out.println(day + "." + month + "." + year);
                } else if(day == 30) {
                    month++;
                    day = 1;
                    System.out.println(day + "." + month + "." + year);
                }
            } else if(month == 12) {
                day = 1;
                month = 1;
                year++;
                System.out.println(day + "." + month + "." + year);
            }
        }
        if (isDateValid(day, month, year)) {
            System.out.println(day + "." + month + "." + year);
        } else {
            System.out.println("Дата введена некорректно!");
        }

    }
    public static boolean isDateValid(int day, int month, int year) {
        if (day <= 0 || day > 31) {
            return false;
        }
        if (month <= 0 || month > 12) {
            return false;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 31) {
                    return false;
                }
                break;
            case 2:
                if (day > 29) {
                    return false;
                }
                break;
        }

        return true;
    }
}
