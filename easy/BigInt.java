package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.next()); scanner.nextLine();
        BigInteger b = new BigInteger(scanner.next()); scanner.close();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

    }
}
