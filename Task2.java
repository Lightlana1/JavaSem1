// 2. Написать метод, который определяет, является ли введенный
// пользователем год високосным, и возвращает в консоль boolean
// (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го,
// при этом каждый 400-й – високосный.
package lesson1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите год: ");
        int numYear = iScanner.nextInt();
        iScanner.close();

        boolean leapYear = false;

        if (numYear%4 == 0){
            leapYear = true;
            if (numYear%100 == 0){
                if (numYear%400 == 0){
                    leapYear = true;
                }
                else {
                    leapYear = false;
                }
            }
        }

        if (!leapYear){
            System.out.printf("%d - невисокосный год", numYear);
        }
        else {
            System.out.printf("%d - високосный год", numYear);
        }
    }
}
