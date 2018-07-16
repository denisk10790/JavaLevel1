import java.util.Scanner;

public class LessonThirdTaskSecond {
    public static void main(String [] args){
        int a =1;
        int b = 1;
        int sum=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        while (sum<n){
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }

    }
}

