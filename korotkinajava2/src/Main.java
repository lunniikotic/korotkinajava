import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("введите  строки a и b ");
        String a = in.nextLine();
        String b = in.nextLine();

        if (a.equals(b)) {
            System.out.println("строки идентичны");
        } else {
            System.out.println("строки не идентичны");
        }
    }
}