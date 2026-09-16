public class TestFactorial {
    public static void main(String[] args) {
        int[] testNumbers = {0, 1, 2, 3, 4, 5, -1};

        for (int num : testNumbers) {
            if (num < 0) {
                System.out.println("Factorial is not defined for negative integers: " + num);
            } else {
                int result = Factorial.calculate(num);
                System.out.println("Factorial of " + num + " = " + result);
            }
        }
    }
}