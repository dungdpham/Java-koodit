public class PalindromeChecker {

    public String transformString(String input) {
        input = input.toLowerCase();
        input = input.replace(",", "");
        input = input.replace("!", "");
        input = input.replace(" ", "");
        return input;
    }

    public boolean isPalindrome(String input) {
        input = transformString(input);
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    public String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        System.out.println(palindromeChecker.isPalindrome("Tenet"));
    }
}
