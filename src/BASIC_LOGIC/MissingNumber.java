package BASIC_LOGIC;

public class MissingNumber {

    private static int missingNumber(int[] input) {
        int n = input.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : input) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 5, 6};
        System.out.print(missingNumber(input));
    }
}