package BASIC_LOGIC;

public class ReverseString {

    private static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        char[] reverseArray = new char[charArray.length];
        int count = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            reverseArray[count] = charArray[i];
            count++;
        }
        return new String(reverseArray);
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.print(reverseString(input));
    }
}
