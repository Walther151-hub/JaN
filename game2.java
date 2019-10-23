package Lession4;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
public class game2 {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    //    public static final char DOT_T = 'T'; //символ для теста ячеек
    public static char[][] map;
    public static Scanner sc = new Scanner (System.in);
    public static Random rand = new Random ();

    public static void main(String[] args) {
        initMap ();
        printMap ();
        while (true) {
            humanTurn ();
            printMap ();
            if (checkWin (DOT_X)) {
                System.out.println ("Победил человек");
                break;
            }
            if (isMapFull ()) {
                System.out.println ("Ничья");
                break;
            }
            aiTurn ();
            printMap ();
            if (checkWin (DOT_O)) {
                System.out.println ("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull ()) {
                System.out.println ("Ничья");
                break;
            }
        }
        System.out.println ("Игра закончена");
    }

    public static boolean checkLine(int cy, int cx, int vy, int vx, char symb) {
        if (cx+vx * DOTS_TO_WIN > SIZE || cy+vy * DOTS_TO_WIN > SIZE ||
                cy+vy * DOTS_TO_WIN < 0) {
            return false;
        }
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[cy+i * vy] [cx+ i * vx] != symb) {
                return false;
            }
        }
        return true;
    }

     static boolean checkWin(char symb) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                if (checkLine (i,j,0,1,symb)|| checkLine (i,j,1,0,symb)||
                        checkLine (i,j,1,1,symb)||checkLine (i,j,-1,1,symb)){

                    return true;
                }
            }
        }
       return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {

        int x = -1;
        int y = -1;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid (i, j) || map[i][j] != DOT_X && map[i][j] != DOT_O) {

                    map[i][j] = DOT_O;
                    if (checkWin (DOT_O)) {
                        y = i;
                        x = j;
                    }
                    map[i][j] = DOT_EMPTY;

                    map[i][j] = DOT_X;
                    if (checkWin (DOT_X)) {
                        y = i;
                        x = j;
                    }
                    map[i][j] = DOT_EMPTY;

                }

            }

        }

        if (x == -1 || y == -1) {
            do {
                x = rand.nextInt (SIZE);
                y = rand.nextInt (SIZE);
            } while (!isCellValid (y, x));
 //           System.out.println ("Компьютер походил в точку "+(x+1)+" "+(y+1));
        }
        map[y][x] = DOT_O;
        System.out.println ("Компьютер походил в точку "+(x+1)+" "+(y+1));
    }



        public static void humanTurn () {
            int y, x;
            do {
                System.out.println ("Введите координаты в формате X Y");
                x = sc.nextInt ()-1;
                y = sc.nextInt ()-1;


            }   while (!isCellValid (y, x)) ;

                map[y][x] = DOT_X;

        }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
       return map[y][x] ==DOT_EMPTY;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print (i+" ");
        }
        System.out.println ();
        for (int i = 0; i < SIZE; i++) {
            System.out.print ((i+1)+" ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print (map[i][j]+" ");
            }
            System.out.println ();
        }
    }
}
