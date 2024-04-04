/*
Дано: Целочисленный двумерный массив NxN
Требуестя: Посчитать суммы в строках массива.
Результат вычислений записывать в одномерный массив.
Вычисление производить в методе.
            Например: public static int[] sumsInRows(int[][] source), т.е делим программу на 3 части
            -- инициализация массива (смотри примечания)
            -- вычисление сумм ( вызов метода)
            -- вывод в консоль результатов
Пример:
1 2 3
4 5 6
7 8 9
Результат: 6, 15, 24
Примечания:
Не использовать библиотеки для работы с массивами
Вод данных НЕ ОБЯЗАТЕЛЬНО организовывать с консоли
ОБЯЗАТЕЛЬНО информативный вывод результатов
 */
public class HomeWork4 {

    public static void main(String[] args) {
        int[][] array = {
                {1, 5, 7},
                {10, 8, 4},
                {15, 2, 1}
        };

        ArrayLib.printArray(sumsInRows(array));
    }

    public static int[] sumsInRows(int[][] array){
        int[] result = new int[array.length];
        for(int i = 0; i < array.length; i++){
            int sum = 0;
            for(int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
            result[i] = sum;
        }
        return result;
    }
}
