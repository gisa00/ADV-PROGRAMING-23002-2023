public class MathMethods {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        int s = sum(6, 9);
        int p = product(6, 9);

        System.out.println("Sum: " + s);
        System.out.println("Product: " + p);
    }
}
