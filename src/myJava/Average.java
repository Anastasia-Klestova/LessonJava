package myJava;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона чисел: ");
        int start = scanner.nextInt();

        System.out.print("Введите конец диапазона чисел: ");
        int end = scanner.nextInt();

        int sum = 0;
        int sumEven = 0;
        int n = 0;
        int count = 0;

        for (int i = start; end >= i; i++) {
            sum += i;
            n++;
            if (i % 2 == 0) {
                sumEven += i;
                count++;
            }
        }

        double average = (double) sum / n;
        double averageEven = (double) sumEven / count;

        System.out.println("Среднее арифметическое чисел: " + average);
        System.out.println("Среднее арифметическое четных чисел: " + averageEven);
    }
}