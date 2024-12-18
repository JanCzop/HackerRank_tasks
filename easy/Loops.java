package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) throws IOException {
            loops_2();
        }

        public static void loops_1() throws IOException{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(bufferedReader.readLine().trim());
            bufferedReader.close();
            int CAP = 10;

            for (int i = 1; i <= CAP ; i++) {
                System.out.println(N + "x " + i + " = " + N*i);
            }
        }

        public static void loops_2(){
            Scanner scanner = new Scanner(System.in);
            int q = scanner.nextInt();
            scanner.nextLine();
            List<String> results = new ArrayList<>();
            for (int i = 0; i < q; i++) {
                String query = scanner.nextLine();
                String[] queries = query.split("\\s+");
                int a,b,n;
                a = Integer.parseInt(queries[0]);
                b = Integer.parseInt(queries[1]);
                n = Integer.parseInt(queries[2]);

                StringBuilder query_result = new StringBuilder();
                int current_result = a;
                for (int j = 0; j < n; j++) {
                    current_result += Math.pow(2,j)*b;
                    query_result.append(current_result);
                    if(j != n-1) query_result.append(" ");
                }
                results.add(query_result.toString());
            }
            scanner.close();
            for (String result : results) {
                System.out.println(result);
            }
        }
}
