package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0; i < n; i++){
            lists.add(new ArrayList<Integer>());
            String str = scanner.nextLine();
            String[] strs = str.split("\\s");
            for (String s : strs) {
                lists.get(i).add(Integer.parseInt(s));
            }
        }
        int m = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < m; i++){
            String str = scanner.nextLine();
            String[] strs = str.split("\\s");
            int x = Integer.parseInt(strs[0]);
            int y = Integer.parseInt(strs[1]);

            if(x > lists.size() || y > lists.get(x).size()) System.out.println("ERROR!");
            else System.out.println(lists.get(x).get(y));

        }
    }
}
