package easy;

import java.util.Scanner;

public class Simple_things {
    public static void main(String[] args) {

    }
    public static void simple_convert(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();
        String converted = String.valueOf(i);
        System.out.println(converted);
    }

}
