package easy;

public class Vararg {
    public static void main(String[] args) {
    }
}
class Add_vararg{
    public void add(int n1, int... n){
        int result = n1;
        StringBuilder builder = new StringBuilder();
        builder.append(n1);
        for(int i = 0; i < n.length; i++){
            result += n[i];
            builder.append("+").append(n[i]);
        }
        builder.append("=").append(result);
        System.out.println(builder.toString());
    }
}

