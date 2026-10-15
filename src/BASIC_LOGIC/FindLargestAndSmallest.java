package BASIC_LOGIC;

public class FindLargestAndSmallest {

    private static void findLargestAndSmallest(int[] input) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : input) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.print("Largest: " + largest);
        System.out.print("Smallest: " + smallest);
    }

    public static void main(String[] args) {

        int[] input = {10, 25, 5, 40, 15, 30};

        findLargestAndSmallest(input);
    }
}