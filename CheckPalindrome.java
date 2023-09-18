public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            char leftChar = str.charAt(i);
            char rightChar = str.charAt(length - 1 - i);

            if (leftChar != rightChar) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input1 = "anna";
        String input2 = "India";

        boolean result1 = isPalindrome(input1);
        boolean result2 = isPalindrome(input2);

        System.out.println(input1 + " is a palindrome: " + result1);
        System.out.println(input2 + " is a palindrome: " + result2);
    }
}
