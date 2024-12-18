package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class Data_types {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            try {
                BigInteger number = new BigInteger(input);

                boolean fitted = false;

                if (number.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                        number.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                    if (!fitted) System.out.println(number + " can be fitted in:");
                    System.out.println("* byte");
                    fitted = true;
                }

                if (number.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                        number.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                    if (!fitted) System.out.println(number + " can be fitted in:");
                    System.out.println("* short");
                    fitted = true;
                }

                if (number.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                        number.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    if (!fitted) System.out.println(number + " can be fitted in:");
                    System.out.println("* int");
                    fitted = true;
                }

                if (number.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                        number.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    if (!fitted) System.out.println(number + " can be fitted in:");
                    System.out.println("* long");
                    fitted = true;
                }

                if (!fitted) {
                    System.out.println(number + " can't be fitted anywhere.");
                }
            } catch (Exception e) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}
