package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        String[] nums = str.split("\\s");
        scanner.close();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(nums[i]);
        }
        List<List<Integer>> subarrays = get_all_subarrays(array);
        int sum = 0;
        for(List<Integer> list : subarrays) {
            if(is_list_sum_negative(list)) sum++;
        }
        System.out.println(sum);
    }
    public void negative_sum_of_subarrays(int[] array){
    }
    public static List<List<Integer>> get_all_subarrays(int[] array) {
        List<List<Integer>> result = new ArrayList<>();

        for (int start = 0; start < array.length; start++) {
            for (int end = start; end < array.length; end++) {
                List<Integer> subarray = new ArrayList<>();
                for (int k = start; k <= end; k++) {
                    subarray.add(array[k]);
                }
                result.add(subarray);
            }
        }

        return result;
    }
    public static boolean is_list_sum_negative(List<Integer> list){
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum < 0;
    }
}
