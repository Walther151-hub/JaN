package Lession2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("1. Задать целочисленный массив, состоящий из элементов 0 и 1.\n Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0");

        int[] c = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задали целочисленный массив\n"+Arrays.toString(c));

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 1) {
                c[i] -= 1;
            } else {
                c[i] += 1;
            }
        }


        System.out.println("Измененный массив\n"+Arrays.toString(c));


        System.out.println("2. Задать пустой целочисленный массив размером 8.\nС помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21");

        int[] arry = new int[8];

        for (int i = 0; i < arry.length; i++) {
            {
                arry[i] = i * 3;
            }
        }
        System.out.println("Заполненный массив\n"+Arrays.toString(arry));

        System.out.println("3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2");

        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] *= 2;
            }
        }

        System.out.println("Умножение выполнено\n"+Arrays.toString(a));

        System.out.println("4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),\n и с помощью цикла(-ов) заполнить его диагональные элементы единицами;");

        int n = 5;
        int[][] kub = new int[n][n];
        //
        for (int i = 0; i < kub.length; i++) {

            kub[i][i] = 1;
            kub[i][n-1-i] = 1;

            for (int j = 0; j < kub.length; j++) {

                System.out.printf("\t%d", kub[i][j]);
            }

            System.out.println();
        }


    System.out.println("5.** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета");

        int[] o = {16, 56, 13,22, 111, 47, 95, 244, 3, 88, 49, 71};

        System.out.println("Массив задан\n"+Arrays.toString(o));

        Arrays.sort(o);

        System.out.println("сортировка\n"+Arrays.toString(o));
//      System.out.println("MAX:"+o.length);
        System.out.println("Мин:"+ o [0] +"\nMAX:"+o[11]);

    }
}



//         ** До остальных не добрался в виду отсутствия времени.





