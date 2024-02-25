package myJava;

import java.util.Scanner;

public class DigitsNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int a = scanner.nextInt();

        int sumAllDigits = 0;
        int sumOddDigits = 0;
        int maxDigit = Integer.MIN_VALUE;
        a = Math.abs(a);

        while (a != 0) {
            int digit = a % 10;
            sumAllDigits += digit;

            if (digit % 2 != 0) {
                sumOddDigits += digit;
            }

            if (digit > maxDigit) {
                maxDigit = digit;
            }

            a /= 10;
        }

        System.out.println("Сумма всех цифр числа: " + sumAllDigits);
        System.out.println("Сумма нечетных цифр числа: " + sumOddDigits);
        System.out.println("Максимальная цифра числа: " + maxDigit);

    }
}