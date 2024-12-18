package medium;

import java.util.Scanner;
import java.util.Stack;

public class Stack_balance {
    private int i;
    public static void main(String[] args) {
        System.out.println(is_string_balanced("{}("));
    }

    public static boolean is_string_balanced(String str){
        if(str.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(') stack.push(str.charAt(i));
            else if(str.charAt(i) == '"'){
                if(!stack.isEmpty() && stack.peek() == str.charAt(i)) stack.pop();
                else stack.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')' && (stack.isEmpty() || stack.pop() != '(')) return false;
            else if(str.charAt(i) == ']' && (stack.isEmpty() ||stack.pop() != '[')) return false;
            else if(str.charAt(i) == '}' && (stack.isEmpty() || stack.pop() != '{')) return false;
        }
        return stack.isEmpty();
    }
}
