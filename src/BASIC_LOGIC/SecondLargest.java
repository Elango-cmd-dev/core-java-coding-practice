package BASIC_LOGIC;

public class SecondLargest {

    private static  int secondLargest(int[] input){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int num : input) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] input = {10, 25, 5, 40, 15, 30};
        System.out.print(secondLargest(input));
    }
}
