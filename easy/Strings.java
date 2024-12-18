package easy;

import java.util.*;

public class Strings {

    public static void main(String[] args) {
        System.out.println(is_palindrome("barylka"));
    }

    public static void strings_1(){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();

        System.out.println(a.length() + b.length());
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        System.out.println(start_to_upper_case(a) + " " + start_to_upper_case(b));
    }

    public static String start_to_upper_case(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);
            if (current.compareTo(smallest) < 0) smallest = current;
            if (current.compareTo(largest) > 0) largest = current;
        }
        return smallest + "\n" + largest;
    }

    public static boolean is_palindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) return false;
        }
        return true;
    }

    public static boolean is_anagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int[] charCount = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i) - 'a']++;
            charCount[s2.charAt(i) - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }


}
