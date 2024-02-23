package myJava;

public class Average {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        int sumEven = 0;
        int k = 0;

        for (int i = 3; i <= 19; i++) {
            sum += i;
            n++;
            if (i % 2 == 0) {
                sumEven += i;
                k++;
            }
        }

        double average = (double) sum / n;
        double averageEven = (double) sumEven / k;

        System.out.println("Среднее арифметическое чисел от 3 до 19: " + average);
        System.out.println("Среднее арифметическое четных чисел: " + averageEven);
    }
}