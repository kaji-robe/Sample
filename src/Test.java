
public class Test {

    public static void main(String[] args) {
        add(45,12);
        double result;
        result = add(12.3, 4.8);
        System.out.println("double型の計算" + result);

    }
    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("int型" + result);
    }

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }


}
