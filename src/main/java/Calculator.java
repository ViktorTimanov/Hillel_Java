import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Для нашей программы для калькулятора из предыдещей ДЗ меняем немного вводные данные.

1. Данные для калькулятора храним в списке вида: "5", "PLUS", "5". Т.е. List<String>
2. Договоримся, что будем использовать только четыре операции: "PLUS", "MINUS", "DIV", "MULT". Все остальные нас не интересуют.
3. Операции могут быть записаны в любом регистре(маленькими, большими буквами или смешанно). Например, "PluS" и "PLUs" это одно и то же
4. Нужно написать метод calculate.
   public static Integer calculate(List<String> data), который делает все вычесления и возврашиет результат.
   При этом может быть возвращен null в случае, если чтото пошло не так.
5. Нужно написать метод вывода результата printResult(List<String> data, Integer result)
        public static void printResult(List<String> data, Integer result).
        Результат нужно выводить в формате:
        5 + 5 = 10, но может быть и 5 + -5 = 0
Примечание:

Использовать switch
Импользовать методы String для преобразования регистров
Информировать пользлователя о том, что что-то пошло не так.
Делать именно так я написал!!!
 */
public class Calculator {

    public static void main(String[] args) {
        List<String> data = List.of("45", "DIV", "5");
        printResult(data, calculate(data));
    }

    public static Integer calculate (List<String> data){
        Integer result = null;
        String firstNumber = data.get(0);
        String operation = data.get(1).toLowerCase();
        String secondNumber = data.get(2);

        switch (operation){
            case ("plus"):
               result = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
               return result;
            case ("minus"):
               result = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
               return result;
            case ("div"):
                if (Integer.parseInt(secondNumber) == 0){
                    System.out.println("Ділити на нуль не можна");
                    return result;
                } else {
                    result = Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber);
                    return result;
                }
            case ("mult"):
                result = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
                return result;
            default:
                return result;
        }

    }

    public static void printResult (List<String> data, Integer result){
        String operation = data.get(1);
        char operationChar = 0;
        if (result == null){
            return;
        }
        switch (operation.toLowerCase()) {
            case "plus" -> operationChar = '+';
            case "minus" -> operationChar = '-';
            case "div" -> operationChar = '/';
            case "mult" -> operationChar = '*';
        }
        System.out.print(data.get(0) + " " + operationChar + " " +  data.get(2) + " = " + result);
    }
}
