package BASIC_LOGIC;

public class CheckPrime {

    private static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int input = 17;
        if (checkPrime(input)) {
            System.out.println(input + " is a prime number");
        } else {
            System.out.println(input + " is not a prime number");
        }
    }
}