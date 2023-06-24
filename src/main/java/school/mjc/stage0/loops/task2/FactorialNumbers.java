package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;

        while (i <= printToInclusive) {
            System.out.println(factorial(i));
            i++;
        }
    }

    private int factorial(int n) {
        int result = 1;
        int i = 2;

        while (i <= n) {
            result *= i;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        FactorialNumbers factorialNumbers = new FactorialNumbers();
        int printToInclusive = 5;
        factorialNumbers.printFactorialRow(printToInclusive);
    }
}
