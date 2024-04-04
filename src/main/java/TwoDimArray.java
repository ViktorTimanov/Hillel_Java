/*
Дано: Целочисленный двумерный массив NxN
Требуестя: Вывести на печать главную и побочную диагонали.
Пример:
1 2 3
4 5 6
7 8 9
главная диагональ: 1, 5 , 9
побочная: 3, 5, 7
Примечания:
Не использовать библиотеки для работы с массивами
Вод данных НЕ ОБЯЗАТЕЛЬНО организовывать с консоли
ОБЯЗАТЕЛЬНО информативный вывод результатов
 */
public class TwoDimArray {

    public static void main(String[] args) {

        int[][] array = {
                {4, 8, 2},
                {3, 2, 1},
                {5, 9, 7}
        };
        int[] arrayMain = array[array.length - 1];
        int[] arraySecond = array[array.length - 1];
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                arrayMain[j] = ints[j];
                arraySecond[j] = ints[array.length - 1 - j];
            }
        }
        ArrayLib.printArray(arrayMain);
        System.out.println();
        ArrayLib.printArray(arraySecond);
    }
}
