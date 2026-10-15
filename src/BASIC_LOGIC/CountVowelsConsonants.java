package BASIC_LOGIC;

public class CountVowelsConsonants {

    private static void count(String input) {
        int vowels = 0;
        int consonants = 0;
        input = input.toLowerCase();
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i'
                        || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.print("Vowels: " + vowels);
        System.out.print("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        String input = "Hello World";
        count(input);
    }
}