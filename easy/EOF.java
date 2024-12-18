package easy;

import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line_counter = 1;
        StringBuilder result = new StringBuilder();
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            result.append(line_counter + " " + line + "\n");
            line_counter++;
        }
        System.out.println(result.toString());
    }
}
