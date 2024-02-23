package myJava;

public class Cycle {
    public static void main(String[] args) {
        int i = 0;
        for (i = 100; i >= 1; i--)
            if (getMultipleOf4(i)) {
                System.out.println(i);
            }
    }

    private static boolean getMultipleOf4(int num) {
        return num % 4 == 0;
    }
}