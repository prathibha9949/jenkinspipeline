public class Factorial {

    public static int calculate(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        int num = 5;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative integers");
        } else {
            int result = calculate(num);
            System.out.println("Factorial of " + num + " = " + result);
        }
    }
}