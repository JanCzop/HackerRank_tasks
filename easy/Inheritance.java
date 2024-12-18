package easy;

public class Inheritance {
    public static void main(String[] args) {
        Adder a = new Adder();
    }


}
class Arithmetic{
    public int add(int n1, int n2){
        return n1+n2;
    }
}
class Adder extends Arithmetic{

}
