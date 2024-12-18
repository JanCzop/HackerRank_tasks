package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String,Integer> phone_book = new HashMap<>();
        for(int i=0;i<n;i++) {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phone_book.put(name,phone);
        }
        while(in.hasNext()) {
            String s=in.nextLine();
            Integer i = phone_book.get(s);
            if (i == null) System.out.println("Not found");
            else System.out.println(s+"="+i);
        }

    }
}
