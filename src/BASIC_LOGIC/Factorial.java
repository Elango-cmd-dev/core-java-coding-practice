package BASIC_LOGIC;

public class Factorial {

    private static int getFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int input = 5;
        int result = getFactorial(input);
        System.out.print(input +" Factorial is : " + result);
    }
}