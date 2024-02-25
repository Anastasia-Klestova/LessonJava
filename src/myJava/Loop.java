package myJava;

public class Loop {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (getMultipleOf4(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean getMultipleOf4(int num) {
        return num % 4 == 0;
    }
}