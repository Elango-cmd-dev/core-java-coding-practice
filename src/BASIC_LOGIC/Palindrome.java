package BASIC_LOGIC;

public class Palindrome {

    private static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        boolean result = isPalindrome(input);
        if (result) {
            System.out.println("The input is palindrome");
        }else{
            System.out.println("The input is not palindrome");
        }
    }
}