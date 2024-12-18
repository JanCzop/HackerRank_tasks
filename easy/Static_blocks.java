package easy;

import java.util.Scanner;

public class Static_blocks {
    static int b,h;
    static boolean flag = false;
    static {
        Scanner scanner = new Scanner(System.in);
        try {
            b = scanner.nextInt();
            h = scanner.nextInt();
            scanner.close();
            if (b <= 0 || h <= 0)
                throw new RuntimeException("java.lang.Exception: Breadth and height must be positive");
            else flag = true;
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area = b*h;
            System.out.println(area);
        }
    }
}
