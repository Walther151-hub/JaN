package Lession3;

//    1. Написать программу, которая загадывает случайное число от 0 до 9, и
//    пользователю дается 3 попытки угадать это число. При каждой попытке компьютер
//    должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
//    После победы или проигрыша выводится запрос
//    – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class tz3Main {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int rep = 0;
        int va = 0;
        int x = random.nextInt(11);
        System.out.println("      Угадай число\nКакое число, от 0 до 10 загаданно?");
//     System.out.println("Загаданное число " +x);
        int usnub = 0;
        while (va < 3 && usnub != x) {
            System.out.print("Твой вариант?");
            usnub = sc.nextInt();
            if (usnub != x) {
                if (usnub < x) {
                    System.out.println("Это число, меньше загаданного");
                } else {
                    System.out.println("Это число, больше загаданного");
                }
                va++;
            }
        }
        if (usnub == x) {
            System.out.println("Ты угадал!\n");
        } else {
            System.out.println("Тебе ещё повезёт!\n");
        }


        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        rep = sc.nextInt();
        if (rep == 1) {
            main(args);
        } else {
            System.out.println("Приходите ещё!");
        }

    }
}

