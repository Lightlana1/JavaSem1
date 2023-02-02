//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
package lesson1;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1,20);
            System.out.print(arr[i] + " ");
        }

        int maxNumber = 0;
        int minNumber = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
            if (arr[i] > maxNumber){
                maxNumber = arr[i];
            }
        }

        System.out.println();
        System.out.printf("Минимальное число = %d", minNumber);
        System.out.println();
        System.out.printf("Максимальное число = %d", maxNumber);

    }
}
