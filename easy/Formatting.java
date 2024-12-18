package easy;

import java.util.Scanner;

public class Formatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3   ; i++) {
            String str = scanner.next();
            int n = scanner.nextInt();
            System.out.printf("%-15s%03d%n",str,n);
        }
        System.out.println("================================");
    }
}
