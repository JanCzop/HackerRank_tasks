package easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hashsets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String first = scanner.next();
            String second = scanner.next();
            String pair = first + "," + second;
            set.add(pair);
            System.out.println(set.size());
        }
        scanner.close();
    }
}
