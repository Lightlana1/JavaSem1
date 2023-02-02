//3. Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному,
// нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов
// массива должны быть отличны от заданного, а остальные - равны ему.
package lesson1;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 3, 5, 6, 3, 6, 3, 2};
        int val = 3;

        int left = 0;
        int right = arr.length - 1;
        int num = 0; // переменная, в которой будем хранить промежуточные значения

        while (left < right){
            if (arr[left] == 3 && arr[right] != 3){
                num = arr[right];
                arr[right] = arr[left];
                arr[left] = num;
                left ++;
                right--;
            }
            if (arr[left] != 3){
                left++;
            }
            if (arr[right] == 3){
                right--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
