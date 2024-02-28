import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите a и b ");

        int a = in.nextInt();
        int b = in.nextInt();

        Calc.compare(a, b);
        Calc.multiply(a, b);
        Calc.plus(a, b);
        Calc.minus(a, b);
        Calc.divide(a, b);
    }
}

