package easy;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();

            int b = scanner.nextInt();

            int result = a / b;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } finally {
            scanner.close();
        }
    }
}
