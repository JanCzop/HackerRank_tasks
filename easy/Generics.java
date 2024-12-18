package easy;

public class Generics {
    public static void main(String[] args) {
    }

    public static <T> void print_two_arrays(T[] array){
        for (T elem : array) {
            System.out.println(elem);
        }
    }

}
