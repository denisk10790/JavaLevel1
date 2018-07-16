import java.util.Scanner;// не забыть восстановить правильный файл из убитого сектора

public class LessonSecondTaskThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый многочлен:");
        double firstDigit = scanner.nextInt();
        System.out.println("Введите второй многочлен:");
        double secondDigit = scanner.nextInt();
        System.out.println("Введите свободный член:");
        double freeDigit = scanner.nextInt();

        if (double discriminant){
            if (0 < discriminant) {
                double x1;
                double x2;
                x1=(-secondDigit + Math.sqrt(discriminant)) / (2 * firstDigit);
                x2=(-secondDigit - Math.sqrt(discriminant)) / (2 * firstDigit);
                System.out.println("первый корень уравнения" + x1);
                System.out.println("второй корень уравнения" + x2);
            } else if (discriminant == 0) {
                double x;
                x = (-secondDigit) / (2 * firstDigit);
                System.out.println("корень уравнения" + x);
            } else {
                System.out.println("уравнение не имеет решений");
            }
        }


    public static double discriminant(double firstDigit, double secondDigit, double freeDigit) {
        double discriminant;
        discriminant = secondDigit * secondDigit - 4 * firstDigit * freeDigit;
        return discriminant;
    }

    public static boolean isZero(double discriminant) {
        if (discriminant == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPositive(double discriminant) {
        if (discriminant > 0) {
            return true;
        } else {
            return false;
        }
    }
}



