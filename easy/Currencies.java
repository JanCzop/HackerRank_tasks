package easy;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currencies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String usFormatted = usFormat.format(payment);

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String indiaFormatted = indiaFormat.format(payment);

        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chinaFormatted = chinaFormat.format(payment);

        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String franceFormatted = franceFormat.format(payment);

        System.out.println("US: " + usFormatted);
        System.out.println("India: " + indiaFormatted);
        System.out.println("China: " + chinaFormatted);
        System.out.println("France: " + franceFormatted);
    }
}
