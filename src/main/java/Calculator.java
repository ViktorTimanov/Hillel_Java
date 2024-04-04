import java.util.Scanner;

/*
Программа должна:
Считывать значения с консоли двух целочисленных значений (класс Scanner из java.utils)
Выводить в консоль результат операций над операндами: сумму, разность, деление, умножение, остаток от деления
Пример ввода/вывода:

Enter first value: 20
Enter second value: 7
Sum: 27
Odd: 13
Mult: 140
Div: 2
Rem: 6
Задание прислать как Calculator.java файл в ответе о выполнении.
Задание со звёздочкой:
Поэкспериментировать с разными типами переменных (long, double, float и т.д.)
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first value: ");
        int firstValue = scanner.nextInt();

        System.out.print("Please enter the second value: ");
        int secondValue = scanner.nextInt();

        System.out.println(firstValue + secondValue);
        System.out.println(firstValue - secondValue);
        System.out.println(firstValue * secondValue);
        if (secondValue == 0){
            System.out.println("Not allowed operation");
        } else {
            System.out.println(firstValue / secondValue);
        }
        System.out.println(firstValue % secondValue);
    }
}
