package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lists {

    public static void main(String[] args) {
        lists_operations();
    }

    public static void lists_operations(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        String[] elems = str.split("\\s");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(elems[i]));
        }
        int num_queries = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num_queries; i++) {
            String operation = scanner.nextLine();
            String arguments = scanner.nextLine();
            String[] splitted_args = arguments.split("\\s");

            if(operation.equals("Insert")){
                list.add(Integer.parseInt(splitted_args[0]),Integer.parseInt(splitted_args[1]));
            }
            else if(operation.equals("Delete")){
                list.remove(Integer.parseInt(splitted_args[0]));
            }
        }
        scanner.close();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
