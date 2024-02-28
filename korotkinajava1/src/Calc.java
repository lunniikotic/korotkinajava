public class Calc {
    public static void compare(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    public static void multiply(int a, int b) {
        int result = a * b;

        System.out.println("a * b = " + result);
    }

    public static void plus(int a, int b) {
        int result = a + b;

        System.out.println("a + b = " + result);
    }

    public static void minus(int a, int b) {
        int result = a + b;

        System.out.println("a - b = " + result);
    }

    public static void divide(int a, int b) {
        float result = ((float)a) / b;

        System.out.println("a / b = " + result);
    }
}