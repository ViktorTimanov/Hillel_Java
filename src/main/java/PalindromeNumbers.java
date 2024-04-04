/*
Есть массив целых чисел. Нужно написать программу, которая проверяет, что этот массив является палиндромом.
https://ru.m.wikipedia.org/wiki/%D0%9F%D0%B0%D0%BB%D0%B8%D0%BD%D0%B4%D1%80%D0%BE%D0%BC
Заметка. Для выполнения используем for и if
Заметка2. Все выводить в консоль с помощью System.out.println/print
Заметка3. Попытаться оптимизировать код. Т.е. произвести как мжно меньше операций
 */

public class PalindromeNumbers {

    public static void main(String[] args) {

        int[] array = {1, 5, 7, 8, 5, 15, 8, 7, 5, 1};
        Boolean isPalindrome = true;

        for (int i = 0; i < array.length / 2; i++){
            isPalindrome = array[i] == array[array.length - 1 - i];
        }
        if (isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
