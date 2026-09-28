import java.util.Scanner;
public class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(5, 10));
        System.out.println(math.add(5, 10, 15));
        System.out.println(math.add(2.5, 4.3));
    }
}
