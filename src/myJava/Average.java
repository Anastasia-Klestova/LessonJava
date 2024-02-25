package myJava;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона чисел: ");
        int start = scanner.nextInt();

        System.out.print("Введите конец диапазона чисел: ");
        int end = scanner.nextInt();

        int sumNumber = 0;
        int sumEven = 0;
        int quantityNumbers = 0;
        int quantityEvenNum = 0;

        for (int i = start; end >= i; i++) {
            sumNumber += i;
            quantityNumbers++;
            if (i % 2 == 0) {
                sumEven += i;
                quantityEvenNum++;
            }
        }

        double average = (double) sumNumber / quantityNumbers;
        double averageEven = (double) sumEven / quantityEvenNum;

        System.out.println("Среднее арифметическое чисел: " + average);
        System.out.println("Среднее арифметическое четных чисел: " + averageEven);
    }
}