package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Prime_test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        bufferedReader.close();
        //if (n.length() > 100) return BigInteger.probablePrime(Integer.parseInt(n));
    }
    public static boolean prime_test(int number){
        if (number <= 1) return false;
        else if (number == 2 || number == 3) return true;
        else if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i <= Math.sqrt(number); i += 6) {
            if (number % i == 0 || number % (i+2) == 0) return false;
        }
        return true;
    }
}
