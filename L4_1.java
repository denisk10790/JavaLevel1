package LessonForth;

public class L4_1 {
    public static void main(String[] args) {
        int k = 1;
        int n = 8;
        int [] mas = new int [n];
        int [] mas1 = new int [n+k];
        System.out.println();
        System.out.println("Заполняем первый массив случайными числами");
        for (int i = 0; i < mas.length; i++){
            mas [i] = (int)(Math.random()*30);
            System.out.format("%3d", mas [i]);
        }
        System.out.println();
        System.out.println("Смещаем массив вправо на k элементов");
        for (int i = 0; i < mas.length; i++){
            mas1[0]=mas[mas.length-1];
            mas1 [i+k] = mas[i];
            mas[i] = mas1[i];
            System.out.format("%3d", mas [i]);
        }
        System.out.println();

        }

    }



